package com.example.examen2Back1.models;

import com.example.examen2Back1.models.Client;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "tbl_orders")
public class Order {

    // Attributes

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String sendingAdress;

    @Column(nullable = false)
    private LocalDateTime dateOrder;

    @Column
    private String orderStatus;

    @Column
    private BigDecimal totalOrder;

    @Column
    private String paymentMethod;

    @Column
    private String clientNotes;

    @Column
    private BigDecimal shipmentCost;

    @Column
    private Boolean active;

    @Column
    private String followingNumber;

    // Constructors

    public Order() {
    }

    public Order(String sendingAdress, LocalDateTime dateOrder, String orderStatus, BigDecimal totalOrder, String paymentMethod, String clientNotes, BigDecimal shipmentCost, Boolean active, String followingNumber) {
        this.sendingAdress = sendingAdress;
        this.dateOrder = dateOrder;
        this.orderStatus = orderStatus;
        this.totalOrder = totalOrder;
        this.paymentMethod = paymentMethod;
        this.clientNotes = clientNotes;
        this.shipmentCost = shipmentCost;
        this.active = active;
        this.followingNumber = followingNumber;
    }

    // Relations

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_client", nullable = false)
    private Client client;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public String getSendingAdress() {
        return sendingAdress;
    }

    public void setSendingAdress(String sendingAdress) {
        this.sendingAdress = sendingAdress;
    }

    public LocalDateTime getDateOrder() {
        return dateOrder;
    }

    public void setDateOrder(LocalDateTime dateOrder) {
        this.dateOrder = dateOrder;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public BigDecimal getTotalOrder() {
        return totalOrder;
    }

    public void setTotalOrder(BigDecimal totalOrder) {
        this.totalOrder = totalOrder;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getClientNotes() {
        return clientNotes;
    }

    public void setClientNotes(String clientNotes) {
        this.clientNotes = clientNotes;
    }

    public BigDecimal getShipmentCost() {
        return shipmentCost;
    }

    public void setShipmentCost(BigDecimal shipmentCost) {
        this.shipmentCost = shipmentCost;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getFollowingNumber() {
        return followingNumber;
    }

    public void setFollowingNumber(String followingNumber) {
        this.followingNumber = followingNumber;
    }
}
