package com.example.demo.entities;

public class AgentStoreRole {
	private enum ROLE {
		AGENT, VIEW;
	}
	private String agentId, storeId;
	private ROLE role;
	
	public AgentStoreRole(String agentId, String storeId, ROLE role) {
		super();
		this.agentId = agentId;
		this.storeId = storeId;
		this.role = role;
	}
	
	public String getAgentId() {
		return agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}
	public String getStoreId() {
		return storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}
	public ROLE getRole() {
		return role;
	}
	public void setRole(ROLE role) {
		this.role = role;
	}
}
