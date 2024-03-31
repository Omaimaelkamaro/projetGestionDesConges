package com.example.demo.controlleurs;

import com.example.demo.entities.Agent;
import com.example.demo.services.AgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/agents")
public class AgentController {

    private final AgentService agentService;

    @Autowired
    public AgentController(AgentService agentService) {
        this.agentService = agentService;
    }

    @GetMapping("/")
    public List<Agent> getAllAgents() {
        return agentService.getAllAgents();
    }

    @GetMapping("/{id}")
    public Optional<Agent> getAgentById(@PathVariable Long id) {
        return agentService.getAgentById(id);
    }

    @PostMapping("/")
    public Agent createAgent(@RequestBody Agent agent) {
        return agentService.createAgent(agent);
    }

    @PutMapping("/{id}")
    public Agent updateAgent(@PathVariable Long id, @RequestBody Agent updatedAgent) {
        return agentService.updateAgent(id, updatedAgent);
    }

    @DeleteMapping("/{id}")
    public void deleteAgent(@PathVariable Long id) {
        agentService.deleteAgent(id);
    }
}

