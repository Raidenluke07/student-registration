package registerations;


import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistrationAction extends Action {

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
                                 HttpServletRequest request, HttpServletResponse response) throws Exception {
        RegistrationForm registrationForm = (RegistrationForm) form;

        String name = registrationForm.getName();
        String dateOfBirth = registrationForm.getDateOfBirth();
        String password = registrationForm.getPassword();
        String confirmPassword = registrationForm.getConfirmPassword();
        String address = registrationForm.getAddress();

        // Basic validation logic
        if (password.equals(confirmPassword)) {
            // Process the registration (e.g., save to database)
            // For now, just simulate success
            return mapping.findForward("success");
        } else {
            // Set error message
            request.setAttribute("errorMessage", "Passwords do not match.");
            return mapping.findForward("failure");
        }
    }
}
