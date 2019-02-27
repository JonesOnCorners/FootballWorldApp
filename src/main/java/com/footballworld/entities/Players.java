package com.footballworld.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@Entity
@Table(name="Players")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Players {
	
	@Id
	@Column(name="player_id")
	private int playerId;

	@Column(name="player_name")
	private String playerName;

	@Column(name="PLAYER_DOB")
	private Date playerDob;

	@Column(name="PLAYER_NATIONALITY")
	private String playernNationality;

	@Column(name="PLAYER_PLACE_OF_BIRTH")
	private String placeOfBirth;

	@Column(name="PLAYER_HEIGHT")
	private int playerHeight;

	@Column(name="PLAYER_PLAYING_POSITION")
	private int playerPlayingPosition;

	@Column(name="COUNTRY_PLAYING_FOR")
	private int countryId;

	@Column(name="CLUB_PLAYING_FOR")
	private int countryID;

	@Column(name="TRANSFER_VALUE")
	private int trannsferValue;

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public Date getPlayerDob() {
		return playerDob;
	}

	public void setPlayerDob(Date playerDob) {
		this.playerDob = playerDob;
	}

	public String getPlayernNationality() {
		return playernNationality;
	}

	public void setPlayernNationality(String playernNationality) {
		this.playernNationality = playernNationality;
	}

	public String getPlaceOfBirth() {
		return placeOfBirth;
	}

	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}

	public int getPlayerHeight() {
		return playerHeight;
	}

	public void setPlayerHeight(int playerHeight) {
		this.playerHeight = playerHeight;
	}

	public int getPlayerPlayingPosition() {
		return playerPlayingPosition;
	}

	public void setPlayerPlayingPosition(int playerPlayingPosition) {
		this.playerPlayingPosition = playerPlayingPosition;
	}

	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public int getCountryID() {
		return countryID;
	}

	public void setCountryID(int countryID) {
		this.countryID = countryID;
	}

	public int getTrannsferValue() {
		return trannsferValue;
	}

	public void setTrannsferValue(int trannsferValue) {
		this.trannsferValue = trannsferValue;
	}

	
	@Override
	public String toString() {
		return "Players [playerId=" + playerId + ", playerName=" + playerName + ", playerDob=" + playerDob
				+ ", playernNationality=" + playernNationality + ", placeOfBirth=" + placeOfBirth + ", playerHeight="
				+ playerHeight + ", playerPlayingPosition=" + playerPlayingPosition + ", countryId=" + countryId
				+ ", countryID=" + countryID + ", trannsferValue=" + trannsferValue + "]";
	}

	

}
