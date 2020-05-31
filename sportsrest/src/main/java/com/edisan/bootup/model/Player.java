package com.edisan.bootup.model;

public class Player {

	public static final Player NULL_PLAYER = new Player(null, null,
			null, null, null, null, null, null);
	
	private final Long id;
	private final String firstName;
	private final String lastName;
	private final Long teamID;
	private final String team;
	private final String position;
	private final String college;
	private final String photoURL;
	
	public Player(Long id, String firstName, String lastName, Long teamID,
			String team, String position, String college, String photoURL) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.teamID = teamID;
		this.team = team;
		this.position = position;
		this.college = college;
		this.photoURL = photoURL;
	}

	public Long getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Long getTeamID() {
		return teamID;
	}

	public String getTeam() {
		return team;
	}

	public String getPosition() {
		return position;
	}

	public String getCollege() {
		return college;
	}

	public String getPhotoURL() {
		return photoURL;
	}
	
	
	
}
