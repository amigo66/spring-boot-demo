package com.bridgeminds.ws.mapper;

import org.apache.ibatis.annotations.Insert;
import com.bridgeminds.ws.entity.TaskStatusEntity;

public interface TaskStatusMapper
{
	@Insert("INSERT INTO task_statuses(`owner_id`,`task_id`,`task_name`,`status_working`,`collected_count`,`collect_process`,`collect_rate`,`start_time`,`type_repeat`,`data_path`,`error`,`service_name`,`in_queue_time`,`stop_time`,`screenshot`,`is_error`,`timer_start`,`finish_time`,`last_finish_time`,`ave_time`,`collect_times`,`last_collected`,`current_collected`,`total_collected`,`timer_start_time`) VALUES(#{ownerId},#{taskId},#{taskName},#{statusWorking},#{collectedCount},#{collectProcess},#{collectRate},#{startTime},#{typeRepeat},#{dataPath},#{error},#{serviceName},#{inQueueTime},#{stopTime},#{screenshot},#{isError},#{timerStart},#{finishTime},#{lastFinishTime},#{aveTime},#{collectTimes},#{lastCollected},#{currentCollected},#{totalCollected},#{timerStartTime})")
	public void insert(TaskStatusEntity status);
}
