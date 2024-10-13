package seedu.address.logic.commands;

import static java.util.Objects.requireNonNull;

import seedu.address.commons.core.index.Index;
import seedu.address.commons.util.ToStringBuilder;
import seedu.address.logic.Messages;
import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.model.Model;
import seedu.address.model.person.Person;

import java.util.List;

/**
 * Deletes a person identified using it's displayed index from the address book.
 */
public class DeleteDoctorCommand extends Command {

    public static final String COMMAND_WORD = "delete";

    public static final String MESSAGE_USAGE = COMMAND_WORD
            + ": Deletes the doctor identified by the index number used in the displayed doctor list.\n"
            + "Parameters: INDEX (must be a positive integer)\n"
            + "Example: " + COMMAND_WORD + " 1";

    public static final String MESSAGE_NOT_IMPLEMENTED_YET = "delete-patient command not implemented yet";

    private final Index targetIndex;

    public DeleteDoctorCommand(Index targetIndex) {
        this.targetIndex = targetIndex;
    }

    @Override
    public CommandResult execute(Model model) throws CommandException {
        requireNonNull(model);
        throw new CommandException(MESSAGE_NOT_IMPLEMENTED_YET);
    }

//    To be implemented once list is completed
//    @Override
//    public CommandResult execute(Model model) throws CommandException {
//        requireNonNull(model);
//        List<Doctor> lastShownList = model.getFilteredDoctorList();
//
//        if (targetIndex.getZeroBased() >= lastShownList.size()) {
//            throw new CommandException(Messages.MESSAGE_INVALID_PERSON_DISPLAYED_INDEX);
//        }
//
//        Person doctorToDelete = lastShownList.get(targetIndex.getZeroBased());
//        model.deletePerson(doctorToDelete);
//        return new CommandResult(String.format(MESSAGE_DELETE_PERSON_SUCCESS, Messages.format(doctorToDelete)));
//    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }

        // instanceof handles nulls
        if (!(other instanceof DeleteDoctorCommand)) {
            return false;
        }

        DeleteDoctorCommand otherDeleteDoctorCommand = (DeleteDoctorCommand) other;
        return targetIndex.equals(otherDeleteDoctorCommand.targetIndex);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .add("targetIndex", targetIndex)
                .toString();
    }
}
