package com.bridgeminds.ws.entity;

/**
 * Created by melman on 08/11/2016.
 */
public class TaskStatusEntity
{
	private String taskId;
	private String taskName;
	private int statusWorking;
	private int collectedCount;
	private int collectProcess;
	private int collectRate;
	private String startTime;
	private int typeRepeat;
	private String error;
	protected int ownerId;
	private String serviceName;
	private String inQueueTime;
	private String stopTime;
	private String screenshot;
	private String dataPath;
	private int isError;
	private int timerStart;
	private String finishTime;
	private String lastFinishTime;
	private int aveTime;
	private int collectTimes;
	private int lastCollected;
	private int currentCollected;
	private int totalCollected;
	private String timerStartTime;

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("\n");
		sb.append("taskId : ").append(taskId).append("\n");
		sb.append("taskName : ").append(taskName).append("\n");
		sb.append("statusWorking : ").append(statusWorking).append("\n");
		sb.append("collectedCount : ").append(collectedCount).append("\n");
		sb.append("collectProcess : ").append(collectProcess).append("\n");
		sb.append("collectRate : ").append(collectRate).append("\n");
		sb.append("startTime : ").append(startTime).append("\n");
		sb.append("typeRepeat : ").append(typeRepeat).append("\n");
		sb.append("ownerId : ").append(ownerId).append("\n");
		sb.append("error : ").append(error).append("\n");
		sb.append("serviceName : ").append(serviceName).append("\n");
		sb.append("inQueueTime : ").append(inQueueTime).append("\n");
		sb.append("stopTime : ").append(stopTime).append("\n");
		sb.append("screenshot : ").append(screenshot).append("\n");
		sb.append("dataPath : ").append(dataPath).append("\n");
		sb.append("isError : ").append(isError).append("\n");
		sb.append("timerStart : ").append(timerStart).append("\n");
		sb.append("finishTime : ").append(finishTime).append("\n");
		sb.append("lastFinishTime : ").append(lastFinishTime).append("\n");
		sb.append("aveTime : ").append(aveTime).append("\n");
		sb.append("collectTimes : ").append(collectTimes).append("\n");
		sb.append("lastCollected : ").append(lastCollected).append("\n");
		sb.append("currentCollected : ").append(currentCollected).append("\n");
		sb.append("totalCollected : ").append(totalCollected).append("\n");
		sb.append("timerStartTime : ").append(timerStartTime).append("\n");

		return sb.toString();
	}

	public String getTaskId()
	{
		return taskId;
	}

	public void setTaskId(String taskId)
	{
		this.taskId = taskId;
	}

	public String getTaskName()
	{
		return taskName;
	}

	public void setTaskName(String taskName)
	{
		this.taskName = taskName;
	}

	public int getStatusWorking()
	{
		return statusWorking;
	}

	public void setStatusWorking(int statusWorking)
	{
		this.statusWorking = statusWorking;
	}

	public int getCollectedCount()
	{
		return collectedCount;
	}

	public void setCollectedCount(int collectedCount)
	{
		this.collectedCount = collectedCount;
	}

	public int getCollectProcess()
	{
		return collectProcess;
	}

	public void setCollectProcess(int collectProcess)
	{
		this.collectProcess = collectProcess;
	}

	public int getCollectRate()
	{
		return collectRate;
	}

	public void setCollectRate(int collectRate)
	{
		this.collectRate = collectRate;
	}

	public String getStartTime()
	{
		return startTime;
	}

	public void setStartTime(String startTime)
	{
		this.startTime = startTime;
	}

	public int getTypeRepeat()
	{
		return typeRepeat;
	}

	public void setTypeRepeat(int typeRepeat)
	{
		this.typeRepeat = typeRepeat;
	}

	public String getError()
	{
		return error;
	}

	public void setError(String error)
	{
		this.error = error;
	}

	public int getOwnerId()
	{
		return ownerId;
	}

	public void setOwnerId(int ownerId)
	{
		this.ownerId = ownerId;
	}

	public String getServiceName()
	{
		return serviceName;
	}

	public void setServiceName(String serviceName)
	{
		this.serviceName = serviceName;
	}

	public String getInQueueTime()
	{
		return inQueueTime;
	}

	public void setInQueueTime(String inQueueTime)
	{
		this.inQueueTime = inQueueTime;
	}

	public String getStopTime()
	{
		return stopTime;
	}

	public void setStopTime(String stopTime)
	{
		this.stopTime = stopTime;
	}

	public String getScreenshot()
	{
		return screenshot;
	}

	public void setScreenshot(String screenshot)
	{
		this.screenshot = screenshot;
	}

	public String getDataPath()
	{
		return dataPath;
	}

	public void setDataPath(String dataPath)
	{
		this.dataPath = dataPath;
	}

	public int getIsError()
	{
		return isError;
	}

	public void setIsError(int isError)
	{
		this.isError = isError;
	}

	public int getTimerStart()
	{
		return timerStart;
	}

	public void setTimerStart(int timerStart)
	{
		this.timerStart = timerStart;
	}

	public String getFinishTime()
	{
		return finishTime;
	}

	public void setFinishTime(String finishTime)
	{
		this.finishTime = finishTime;
	}

	public String getLastFinishTime()
	{
		return lastFinishTime;
	}

	public void setLastFinishTime(String lastFinishTime)
	{
		this.lastFinishTime = lastFinishTime;
	}

	public int getAveTime()
	{
		return aveTime;
	}

	public void setAveTime(int aveTime)
	{
		this.aveTime = aveTime;
	}

	public int getCollectTimes()
	{
		return collectTimes;
	}

	public void setCollectTimes(int collectTimes)
	{
		this.collectTimes = collectTimes;
	}

	public int getLastCollected()
	{
		return lastCollected;
	}

	public void setLastCollected(int lastCollected)
	{
		this.lastCollected = lastCollected;
	}

	public int getCurrentCollected()
	{
		return currentCollected;
	}

	public void setCurrentCollected(int currentCollected)
	{
		this.currentCollected = currentCollected;
	}

	public int getTotalCollected()
	{
		return totalCollected;
	}

	public void setTotalCollected(int totalCollected)
	{
		this.totalCollected = totalCollected;
	}

	public String getTimerStartTime()
	{
		return timerStartTime;
	}

	public void setTimerStartTime(String timerStartTime)
	{
		this.timerStartTime = timerStartTime;
	}

}
