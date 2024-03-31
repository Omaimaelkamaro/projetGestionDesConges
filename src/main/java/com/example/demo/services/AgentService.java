package com.example.demo.services;

import com.example.demo.entities.Agent;
import com.example.demo.repositories.AgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AgentService {

    private final AgentRepository agentRepository;

    @Autowired
    public AgentService(AgentRepository agentRepository) {
        this.agentRepository = agentRepository;
    }

    public List<Agent> getAllAgents() {
        return agentRepository.findAll();
    }

    public Optional<Agent> getAgentById(Long id) {
        return agentRepository.findById(id);
    }

    public Agent createAgent(Agent agent) {
        return agentRepository.save(agent);
    }

    public Agent updateAgent(Long id, Agent updatedAgent) {
        if (agentRepository.existsById(id)) {
            updatedAgent.setId(id);
            return agentRepository.save(updatedAgent);
        } else {
            return null; // Ou une gestion d'exception appropriée si l'agent n'existe pas
        }
    }

    public void deleteAgent(Long id) {
        agentRepository.deleteById(id);
    }
}
