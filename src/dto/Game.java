package dto;

import java.util.List;

public class Game {

	private int championId, level, mapId, spell1, spell2, teamId;
	private long createDate, gameId;
	private List<Player> fellowPlayers;
	private String gameMode, gameType, subType;
	private boolean invalid;
	private List<RawStat> statistics;
	
	public long getCreateDate() {
		return createDate;
	}

	public long getGameId() {
		return gameId;
	}

	public int getTeamId() {
		return teamId;
	}

	public int getLevel() {
		return level;
	}

	public int getSpell2() {
		return spell2;
	}

	public int getChampionId() {
		return championId;
	}

	public List<Player> getFellowPlayers() {
		return fellowPlayers;
	}

	public int getSpell1() {
		return spell1;
	}

	public int getMapId() {
		return mapId;
	}

	public boolean isInvalid() {
		return invalid;
	}

	public String getSubType() {
		return subType;
	}

	public String getGameType() {
		return gameType;
	}

	public String getGameMode() {
		return gameMode;
	}

	public List<RawStat> getStatistics() {
		return statistics;
	}

}
