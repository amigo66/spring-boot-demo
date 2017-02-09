package com.bridgeminds.ws.entity;

public class TaskEntity
{
	private String task_id;
	private String config_info;
	private long create_time;
	private short is_incremental;
	private short is_timer_start;
	private String name;
	private short need_screenshot;
	private String project_id;
	private String project_name;
	private int owner_id;
	private String owner_name;
	private long start_time;
	private int status;
	private long stop_time;
	private int type_repeat;
	private int type_task;
	private long update_time;
	private int version;
	private short is_favorite;
	private int step_progress;
	private short is_start;

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("task_id : ").append(task_id).append("\n");
		sb.append("config_info : ").append(config_info).append("\n");
		sb.append("create_time : ").append(create_time).append("\n");
		sb.append("is_incremental : ").append(is_incremental).append("\n");
		sb.append("is_timer_start : ").append(is_timer_start).append("\n");
		sb.append("name : ").append(name).append("\n");
		sb.append("need_screenshot : ").append(need_screenshot).append("\n");
		sb.append("project_id : ").append(project_id).append("\n");
		sb.append("project_name : ").append(project_name).append("\n");
		sb.append("owner_id : ").append(owner_id).append("\n");
		sb.append("owner_name : ").append(owner_name).append("\n");
		sb.append("start_time : ").append(start_time).append("\n");
		sb.append("status : ").append(status).append("\n");
		sb.append("stop_time : ").append(stop_time).append("\n");
		sb.append("type_repeat : ").append(type_repeat).append("\n");
		sb.append("type_task : ").append(type_task).append("\n");
		sb.append("update_time : ").append(update_time).append("\n");
		sb.append("version : ").append(version).append("\n");
		sb.append("is_favorite : ").append(is_favorite).append("\n");
		sb.append("step_progress : ").append(step_progress).append("\n");
		sb.append("is_start : ").append(is_start).append("\n");

		return sb.toString();
	}

	public String getTask_id()
	{
		return task_id;
	}

	public void setTask_id(String task_id)
	{
		this.task_id = task_id;
	}

	public String getConfig_info()
	{
		return config_info;
	}

	public void setConfig_info(String config_info)
	{
		this.config_info = config_info;
	}

	public long getCreate_time()
	{
		return create_time;
	}

	public void setCreate_time(long create_time)
	{
		this.create_time = create_time;
	}

	public short getIs_incremental()
	{
		return is_incremental;
	}

	public void setIs_incremental(short is_incremental)
	{
		this.is_incremental = is_incremental;
	}

	public short getIs_timer_start()
	{
		return is_timer_start;
	}

	public void setIs_timer_start(short is_timer_start)
	{
		this.is_timer_start = is_timer_start;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public short getNeed_screenshot()
	{
		return need_screenshot;
	}

	public void setNeed_screenshot(short need_screenshot)
	{
		this.need_screenshot = need_screenshot;
	}

	public String getProject_id()
	{
		return project_id;
	}

	public void setProject_id(String project_id)
	{
		this.project_id = project_id;
	}

	public String getProject_name()
	{
		return project_name;
	}

	public void setProject_name(String project_name)
	{
		this.project_name = project_name;
	}

	public int getOwner_id()
	{
		return owner_id;
	}

	public void setOwner_id(int owner_id)
	{
		this.owner_id = owner_id;
	}

	public String getOwner_name()
	{
		return owner_name;
	}

	public void setOwner_name(String owner_name)
	{
		this.owner_name = owner_name;
	}

	public long getStart_time()
	{
		return start_time;
	}

	public void setStart_time(long start_time)
	{
		this.start_time = start_time;
	}

	public int getStatus()
	{
		return status;
	}

	public void setStatus(int status)
	{
		this.status = status;
	}

	public long getStop_time()
	{
		return stop_time;
	}

	public void setStop_time(long stop_time)
	{
		this.stop_time = stop_time;
	}

	public int getType_repeat()
	{
		return type_repeat;
	}

	public void setType_repeat(int type_repeat)
	{
		this.type_repeat = type_repeat;
	}

	public int getType_task()
	{
		return type_task;
	}

	public void setType_task(int type_task)
	{
		this.type_task = type_task;
	}

	public long getUpdate_time()
	{
		return update_time;
	}

	public void setUpdate_time(long update_time)
	{
		this.update_time = update_time;
	}

	public int getVersion()
	{
		return version;
	}

	public void setVersion(int version)
	{
		this.version = version;
	}

	public short getIs_favorite()
	{
		return is_favorite;
	}

	public void setIs_favorite(short is_favorite)
	{
		this.is_favorite = is_favorite;
	}

	public int getStep_progress()
	{
		return step_progress;
	}

	public void setStep_progress(int step_progress)
	{
		this.step_progress = step_progress;
	}

	public short getIs_start()
	{
		return is_start;
	}

	public void setIs_start(short is_start)
	{
		this.is_start = is_start;
	}
}
