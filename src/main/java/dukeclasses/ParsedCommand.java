package dukeclasses;

import java.time.LocalDate;

/**
 * Represents a wrapper class after user input is processed.Created if user input is valid.
 */
public class ParsedCommand {
    private String command;
    private Integer index;
    private LocalDate dueDate;
    private String task;

    /**
     * Constructor for ParsedCommand for commands that only need String to be instantiated.
     *
     * @param command String , usually the command, that is used to instantiated Tasks.
     */
    public ParsedCommand(String command) {
        this.command = command;
        this.index = null;
        this.dueDate = null;
        this.task = null;
    }

    /**
     * Constructor for ParsedCommand for commands that  need a String and Integer to be instantiated.
     *
     * @param command String , usually the command, that is used to instantiated Tasks.
     * @param index Integer , usually representing index of task in the TaskList, that is used
     *              to modify the indexed task in the TaskList.
     */
    public ParsedCommand(String command, Integer index) {
        this.command = command;
        this.index = index;
        this.dueDate = null;
        this.task = null;
    }

    /**
     * Constructor for ParsedCommand for commands that  need a String and Integer to be instantiated.
     *
     * @param command String , usually the command, that is used to instantiated Tasks.
     * @param task String , usually the description of the Task, that
     *             is used to identify the task in the task list.
     */
    public ParsedCommand(String command, String task) {
        this.command = command;
        this.index = index;
        this.dueDate = null;
        this.task = task;
    }

    /**
     * Constructor for ParsedCommand for commands that  need a String and LocalDate to be instantiated.
     *
     * @param command String ,usually the command, that is used to instantiated Tasks.
     * @param dueDate LocalDate, usually the dateline of the task, that
     *             is used to identify the task in the task list.
     */
    public ParsedCommand(String command, String task, LocalDate dueDate) {
        this.command = command;
        this.index = index;
        this.dueDate = dueDate;
        this.task = task;
    }

    /**
     * Returns the command the user gave.
     *
     * @return String that represents the command the user gave.
     */
    public String getCommand() {
        return this.command;
    }

    /**
     * Returns the index the user gave.
     *
     * @return Integer that represents the index the user gave.
     */
    public Integer getIndex() {
        return this.index;
    }

    /**
     * Returns the due date the user gave.
     *
     * @return LocalDate that represents the due date of the
     *         task which is given by the user.
     */
    public LocalDate getDueDate() {
        return this.dueDate;
    }

    /**
     * Returns the description of the task.
     *
     * @return String that represents the description of the task.
     */
    public String getTask() {
        return this.task;
    }

}