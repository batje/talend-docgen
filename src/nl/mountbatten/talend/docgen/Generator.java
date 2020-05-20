package nl.mountbatten.talend.docgen;


import org.apache.log4j.Logger;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.talend.commons.CommonsPlugin;

// Eclipse application plugin used to generate Job documentation from the command line
//
// First, mimic what is here:
// https://github.com/Talend/tcommon-studio-se/blob/release/7.3.1/main/plugins/org.talend.rcp/src/main/java/org/talend/rcp/intro/Application.java

public class Generator implements IApplication {
    private static Logger log = Logger.getLogger(Generator.class);

    public Object start(IApplicationContext context) throws Exception {
       log.info("We are Starting");

        // Let talend services know we are running in headless mode
        // so they don't use ui stuff like messageboxes for exceptions
        CommonsPlugin.setHeadless(true);

        return EXIT_OK;
    }

    public void stop() {
        // method stub
    }

}
