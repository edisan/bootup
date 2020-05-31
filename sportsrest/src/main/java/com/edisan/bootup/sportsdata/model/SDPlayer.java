package com.edisan.bootup.sportsdata.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SDPlayer implements Serializable {

	@JsonProperty("PlayerID")
	private Long PlayerID;
	
	@JsonProperty("SportsDataID")
	private String SportsDataID;
	
	@JsonProperty("Status")
	private String Status;
	
	@JsonProperty("TeamID")
	private Long TeamID;
	
	@JsonProperty("Team")
	private String Team;
	
	@JsonProperty("Jersey")
	private Long Jersey;
	
	@JsonProperty("PositionCategory")
	private String PositionCategory;
	
	@JsonProperty("Position")
	private String Position;
	
	@JsonProperty("FirstName")
	private String FirstName;
	
	@JsonProperty("LastName")
	private String LastName;
	
	@JsonProperty("Height")
	private Long Height;
	
	@JsonProperty("Weight")
	private Long Weight;
	
	@JsonProperty("BirthDate")
	private String BirthDate;
	
	@JsonProperty("BirthCity")
	private String BirthCity;
	
	@JsonProperty("BirthState")
	private String BirthState;
	
	@JsonProperty("BirthCountry")
	private String BirthCountry;
	
	@JsonProperty("HighSchool")
	private String HighSchool;
	
	@JsonProperty("College")
	private String College;
	
	@JsonProperty("Salary")
	private Long Salary;
	
	@JsonProperty("PhotoUrl")
	private String PhotoUrl;
	
	@JsonProperty("Experience")
	private Long Experience;
	
	@JsonProperty("SportRadarPlayerID")
	private String SportRadarPlayerID;
	
	@JsonProperty("RotoworldPlayerID")
	private Long RotoworldPlayerID;
	
	@JsonProperty("RotoWirePlayerID")
	private Long RotoWirePlayerID;
	
	@JsonProperty("FantasyAlarmPlayerID")
	private Long FantasyAlarmPlayerID;
	
	@JsonProperty("StatsPlayerID")
	private Long StatsPlayerID;
	
	@JsonProperty("SportsDirectPlayerID")
	private Long SportsDirectPlayerID;
	
	@JsonProperty("XmlTeamPlayerID")
	private Long XmlTeamPlayerID;
	
	@JsonProperty("InjuryStatus")
	private String InjuryStatus;
	
	@JsonProperty("InjuryBodyPart")
	private String InjuryBodyPart;
	
	@JsonProperty("InjuryStartDate")
	private String InjuryStartDate;
	
	@JsonProperty("InjuryNotes")
	private String InjuryNotes;
	
	@JsonProperty("FanDuelPlayerID")
	private Long FanDuelPlayerID;
	
	@JsonProperty("DraftKingsPlayerID")
	private Long DraftKingsPlayerID;
	
	@JsonProperty("YahooPlayerID")
	private Long YahooPlayerID;
	
	@JsonProperty("FanDuelName")
	private String FanDuelName;
	
	@JsonProperty("DraftKingsName")
	private String DraftKingsName;
	
	@JsonProperty("YahooName")
	private String YahooName;
	
	@JsonProperty("DepthChartPosition")
	private String DepthChartPosition;
	
	@JsonProperty("DepthChartOrder")
	private Long DepthChartOrder;
	
	@JsonProperty("GlobalTeamID")
	private Long GlobalTeamID;
	
	@JsonProperty("FantasyDraftName")
	private String FantasyDraftName;
	
	@JsonProperty("FantasyDraftPlayerID")
	private Long FantasyDraftPlayerID;
	
	@JsonProperty("UsaTodayPlayerID")
	private Long UsaTodayPlayerID;
	
	@JsonProperty("UsaTodayHeadshotUrl")
	private String UsaTodayHeadshotUrl;
	
	@JsonProperty("UsaTodayHeadshotNoBackgroundUrl")
	private String UsaTodayHeadshotNoBackgroundUrl;
	
	@JsonProperty("UsaTodayHeadshotUpdated")
	private String UsaTodayHeadshotUpdated;
	
	@JsonProperty("UsaTodayHeadshotNoBackgroundUpdated")
	private String UsaTodayHeadshotNoBackgroundUpdated;
	
	@JsonProperty("NbaDotComPlayerID")
	private Long NbaDotComPlayerID;
	
	public SDPlayer() {
		
	}
	
	public Long getPlayerID() {
		return PlayerID;
	}

	public void setPlayerID(Long playerID) {
		PlayerID = playerID;
	}

	public String getSportsDataID() {
		return SportsDataID;
	}

	public void setSportsDataID(String sportsDataID) {
		SportsDataID = sportsDataID;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public Long getTeamID() {
		return TeamID;
	}

	public void setTeamID(Long teamID) {
		TeamID = teamID;
	}

	public String getTeam() {
		return Team;
	}

	public void setTeam(String team) {
		Team = team;
	}

	public Long getJersey() {
		return Jersey;
	}

	public void setJersey(Long jersey) {
		Jersey = jersey;
	}

	public String getPositionCategory() {
		return PositionCategory;
	}

	public void setPositionCategory(String positionCategory) {
		PositionCategory = positionCategory;
	}

	public String getPosition() {
		return Position;
	}

	public void setPosition(String position) {
		Position = position;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public Long getHeight() {
		return Height;
	}

	public void setHeight(Long height) {
		Height = height;
	}

	public Long getWeight() {
		return Weight;
	}

	public void setWeight(Long weight) {
		Weight = weight;
	}

	public String getBirthDate() {
		return BirthDate;
	}

	public void setBirthDate(String birthDate) {
		BirthDate = birthDate;
	}

	public String getBirthCity() {
		return BirthCity;
	}

	public void setBirthCity(String birthCity) {
		BirthCity = birthCity;
	}

	public String getBirthState() {
		return BirthState;
	}

	public void setBirthState(String birthState) {
		BirthState = birthState;
	}

	public String getBirthCountry() {
		return BirthCountry;
	}

	public void setBirthCountry(String birthCountry) {
		BirthCountry = birthCountry;
	}

	public String getHighSchool() {
		return HighSchool;
	}

	public void setHighSchool(String highSchool) {
		HighSchool = highSchool;
	}

	public String getCollege() {
		return College;
	}

	public void setCollege(String college) {
		College = college;
	}

	public Long getSalary() {
		return Salary;
	}

	public void setSalary(Long salary) {
		Salary = salary;
	}

	public String getPhotoUrl() {
		return PhotoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		PhotoUrl = photoUrl;
	}

	public Long getExperience() {
		return Experience;
	}

	public void setExperience(Long experience) {
		Experience = experience;
	}

	public String getSportRadarPlayerID() {
		return SportRadarPlayerID;
	}

	public void setSportRadarPlayerID(String sportRadarPlayerID) {
		SportRadarPlayerID = sportRadarPlayerID;
	}

	public Long getRotoworldPlayerID() {
		return RotoworldPlayerID;
	}

	public void setRotoworldPlayerID(Long rotoworldPlayerID) {
		RotoworldPlayerID = rotoworldPlayerID;
	}

	public Long getRotoWirePlayerID() {
		return RotoWirePlayerID;
	}

	public void setRotoWirePlayerID(Long rotoWirePlayerID) {
		RotoWirePlayerID = rotoWirePlayerID;
	}

	public Long getFantasyAlarmPlayerID() {
		return FantasyAlarmPlayerID;
	}

	public void setFantasyAlarmPlayerID(Long fantasyAlarmPlayerID) {
		FantasyAlarmPlayerID = fantasyAlarmPlayerID;
	}

	public Long getStatsPlayerID() {
		return StatsPlayerID;
	}

	public void setStatsPlayerID(Long statsPlayerID) {
		StatsPlayerID = statsPlayerID;
	}

	public Long getSportsDirectPlayerID() {
		return SportsDirectPlayerID;
	}

	public void setSportsDirectPlayerID(Long sportsDirectPlayerID) {
		SportsDirectPlayerID = sportsDirectPlayerID;
	}

	public Long getXmlTeamPlayerID() {
		return XmlTeamPlayerID;
	}

	public void setXmlTeamPlayerID(Long xmlTeamPlayerID) {
		XmlTeamPlayerID = xmlTeamPlayerID;
	}

	public String getInjuryStatus() {
		return InjuryStatus;
	}

	public void setInjuryStatus(String injuryStatus) {
		InjuryStatus = injuryStatus;
	}

	public String getInjuryBodyPart() {
		return InjuryBodyPart;
	}

	public void setInjuryBodyPart(String injuryBodyPart) {
		InjuryBodyPart = injuryBodyPart;
	}

	public String getInjuryStartDate() {
		return InjuryStartDate;
	}

	public void setInjuryStartDate(String injuryStartDate) {
		InjuryStartDate = injuryStartDate;
	}

	public String getInjuryNotes() {
		return InjuryNotes;
	}

	public void setInjuryNotes(String injuryNotes) {
		InjuryNotes = injuryNotes;
	}

	public Long getFanDuelPlayerID() {
		return FanDuelPlayerID;
	}

	public void setFanDuelPlayerID(Long fanDuelPlayerID) {
		FanDuelPlayerID = fanDuelPlayerID;
	}

	public Long getDraftKingsPlayerID() {
		return DraftKingsPlayerID;
	}

	public void setDraftKingsPlayerID(Long draftKingsPlayerID) {
		DraftKingsPlayerID = draftKingsPlayerID;
	}

	public Long getYahooPlayerID() {
		return YahooPlayerID;
	}

	public void setYahooPlayerID(Long yahooPlayerID) {
		YahooPlayerID = yahooPlayerID;
	}

	public String getFanDuelName() {
		return FanDuelName;
	}

	public void setFanDuelName(String fanDuelName) {
		FanDuelName = fanDuelName;
	}

	public String getDraftKingsName() {
		return DraftKingsName;
	}

	public void setDraftKingsName(String draftKingsName) {
		DraftKingsName = draftKingsName;
	}

	public String getYahooName() {
		return YahooName;
	}

	public void setYahooName(String yahooName) {
		YahooName = yahooName;
	}

	public String getDepthChartPosition() {
		return DepthChartPosition;
	}

	public void setDepthChartPosition(String depthChartPosition) {
		DepthChartPosition = depthChartPosition;
	}

	public Long getDepthChartOrder() {
		return DepthChartOrder;
	}

	public void setDepthChartOrder(Long depthChartOrder) {
		DepthChartOrder = depthChartOrder;
	}

	public Long getGlobalTeamID() {
		return GlobalTeamID;
	}

	public void setGlobalTeamID(Long globalTeamID) {
		GlobalTeamID = globalTeamID;
	}

	public String getFantasyDraftName() {
		return FantasyDraftName;
	}

	public void setFantasyDraftName(String fantasyDraftName) {
		FantasyDraftName = fantasyDraftName;
	}

	public Long getFantasyDraftPlayerID() {
		return FantasyDraftPlayerID;
	}

	public void setFantasyDraftPlayerID(Long fantasyDraftPlayerID) {
		FantasyDraftPlayerID = fantasyDraftPlayerID;
	}

	public Long getUsaTodayPlayerID() {
		return UsaTodayPlayerID;
	}

	public void setUsaTodayPlayerID(Long usaTodayPlayerID) {
		UsaTodayPlayerID = usaTodayPlayerID;
	}

	public String getUsaTodayHeadshotUrl() {
		return UsaTodayHeadshotUrl;
	}

	public void setUsaTodayHeadshotUrl(String usaTodayHeadshotUrl) {
		UsaTodayHeadshotUrl = usaTodayHeadshotUrl;
	}

	public String getUsaTodayHeadshotNoBackgroundUrl() {
		return UsaTodayHeadshotNoBackgroundUrl;
	}

	public void setUsaTodayHeadshotNoBackgroundUrl(String usaTodayHeadshotNoBackgroundUrl) {
		UsaTodayHeadshotNoBackgroundUrl = usaTodayHeadshotNoBackgroundUrl;
	}

	public String getUsaTodayHeadshotUpdated() {
		return UsaTodayHeadshotUpdated;
	}

	public void setUsaTodayHeadshotUpdated(String usaTodayHeadshotUpdated) {
		UsaTodayHeadshotUpdated = usaTodayHeadshotUpdated;
	}

	public String getUsaTodayHeadshotNoBackgroundUpdated() {
		return UsaTodayHeadshotNoBackgroundUpdated;
	}

	public void setUsaTodayHeadshotNoBackgroundUpdated(String usaTodayHeadshotNoBackgroundUpdated) {
		UsaTodayHeadshotNoBackgroundUpdated = usaTodayHeadshotNoBackgroundUpdated;
	}

	public Long getNbaDotComPlayerID() {
		return NbaDotComPlayerID;
	}

	public void setNbaDotComPlayerID(Long nbaDotComPlayerID) {
		NbaDotComPlayerID = nbaDotComPlayerID;
	}

	public String toString() {
		return "SDPlayer {PlayerID: " + getPlayerID()
			+ ", FirstName: " + getFirstName()
			+ ", LastName: " + getLastName()
			+ "}";
	}
}
