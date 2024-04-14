package com.example.demo.services;

import com.example.demo.entities.Notification;
import com.example.demo.repositories.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NotificationService {

    private final NotificationRepository notificationRepository;

    @Autowired
    public NotificationService(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    public List<Notification> getAllNotifications() {
        return notificationRepository.findAll();
    }

    public Optional<Notification> getNotificationById(Long id) {
        return notificationRepository.findById(id);
    }

    public Notification createNotification(Notification notification) {
        return notificationRepository.save(notification);
    }

    public Notification updateNotification(Long id, Notification updatedNotification) {
        if (notificationRepository.existsById(id)) {
            updatedNotification.setId(id);
            return notificationRepository.save(updatedNotification);
        } else {
            return null; // Ou une gestion d'exception appropriée si la notification n'existe pas
        }
    }

    public void deleteNotification(Long id) {
        notificationRepository.deleteById(id);
    }
}
