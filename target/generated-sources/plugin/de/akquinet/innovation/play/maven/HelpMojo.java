package de.akquinet.innovation.play.maven;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;

/**
 * Display help information on dvn.<br/> Call <pre>  mvn dvn:help -Ddetail=true -Dgoal=&lt;goal-name&gt;</pre> to display parameter details.
 *
 * @version generated on Wed Jan 30 12:17:45 EST 2013
 * @author org.apache.maven.tools.plugin.generator.PluginHelpGenerator (version 2.8)
 * @goal help
 * @requiresProject false
 * @threadSafe
 */
public class HelpMojo
    extends AbstractMojo
{
    /**
     * If <code>true</code>, display all settable properties for each goal.
     * 
     * @parameter expression="${detail}" default-value="false"
     */
    private boolean detail;

    /**
     * The name of the goal for which to show help. If unspecified, all goals will be displayed.
     * 
     * @parameter expression="${goal}"
     */
    private java.lang.String goal;

    /**
     * The maximum length of a display line, should be positive.
     * 
     * @parameter expression="${lineLength}" default-value="80"
     */
    private int lineLength;

    /**
     * The number of spaces per indentation level, should be positive.
     * 
     * @parameter expression="${indentSize}" default-value="2"
     */
    private int indentSize;


    /** {@inheritDoc} */
    public void execute()
        throws MojoExecutionException
    {
        if ( lineLength <= 0 )
        {
            getLog().warn( "The parameter 'lineLength' should be positive, using '80' as default." );
            lineLength = 80;
        }
        if ( indentSize <= 0 )
        {
            getLog().warn( "The parameter 'indentSize' should be positive, using '2' as default." );
            indentSize = 2;
        }

        StringBuffer sb = new StringBuffer();

        append( sb, "edu.harvard.iq:dvn:3.4", 0 );
        append( sb, "", 0 );

        append( sb, "Dataverse Network", 0 );
        append( sb, "A web application for sharing, citing, analyzing, and preserving research data", 1 );
        append( sb, "", 0 );

        if ( goal == null || goal.length() <= 0 )
        {
            append( sb, "This plugin has 10 goals:", 0 );
            append( sb, "", 0 );
        }

        if ( goal == null || goal.length() <= 0 || "clean".equals( goal ) )
        {
            append( sb, "dvn:clean", 0 );
            append( sb, "Clean the project.", 1 );
            append( sb, "", 0 );
            if ( detail )
            {
                append( sb, "Available parameters:", 1 );
                append( sb, "", 0 );

                append( sb, "baseDirectory", 2 );
                append( sb, "Base directory of the project.", 3 );
                append( sb, "Expression: ${basedir}", 3 );
                append( sb, "", 0 );

                append( sb, "buildDirectory", 2 );
                append( sb, "Directory containing the build files.", 3 );
                append( sb, "Expression: ${project.build.directory}", 3 );
                append( sb, "", 0 );

                append( sb, "cleanLibFolder (Default: true)", 2 );
                append( sb, "Set to false to avoid to clean the lib folder..", 3 );
                append( sb, "", 0 );

                append( sb, "lib (Default: lib)", 2 );
                append( sb, "Where are the dependencies copied.", 3 );
                append( sb, "", 0 );

                append( sb, "play2Home", 2 );
                append( sb, "The PLAY2_HOME path is taken from this setting, if not found as a Java system property (-DPLAY2_HOME). Refers to the PLAY2_HOME environment variable by default. So that means that the PLAY2_HOME can be given using:\n1.\tA system variable defined by the system or with -DPLAY2_HOME=...\n2.\tThe play2Home configuration property\n3.\tThe PLAY2_HOME environment property\n", 3 );
                append( sb, "Expression: ${env.PLAY2_HOME}", 3 );
                append( sb, "", 0 );

                append( sb, "play2SystemProperties", 2 );
                append( sb, "Allows customization of the play execution System properties.", 3 );
                append( sb, "", 0 );

                append( sb, "timeout (Default: -1)", 2 );
                append( sb, "Sets a timeout to the play invocation (in milliseconds). If not set (or set to -1, the plugin waits until the underlying play process completes. If set, the plugin kills the underlying play process when the timeout is reached, and it fails the build.", 3 );
                append( sb, "Expression: ${play2timeout}", 3 );
                append( sb, "", 0 );
            }
        }

        if ( goal == null || goal.length() <= 0 || "compile".equals( goal ) )
        {
            append( sb, "dvn:compile", 0 );
            append( sb, "Compile the Play application", 1 );
            append( sb, "", 0 );
            if ( detail )
            {
                append( sb, "Available parameters:", 1 );
                append( sb, "", 0 );

                append( sb, "baseDirectory", 2 );
                append( sb, "Base directory of the project.", 3 );
                append( sb, "Expression: ${basedir}", 3 );
                append( sb, "", 0 );

                append( sb, "buildDirectory", 2 );
                append( sb, "Directory containing the build files.", 3 );
                append( sb, "Expression: ${project.build.directory}", 3 );
                append( sb, "", 0 );

                append( sb, "play2Home", 2 );
                append( sb, "The PLAY2_HOME path is taken from this setting, if not found as a Java system property (-DPLAY2_HOME). Refers to the PLAY2_HOME environment variable by default. So that means that the PLAY2_HOME can be given using:\n1.\tA system variable defined by the system or with -DPLAY2_HOME=...\n2.\tThe play2Home configuration property\n3.\tThe PLAY2_HOME environment property\n", 3 );
                append( sb, "Expression: ${env.PLAY2_HOME}", 3 );
                append( sb, "", 0 );

                append( sb, "play2SystemProperties", 2 );
                append( sb, "Allows customization of the play execution System properties.", 3 );
                append( sb, "", 0 );

                append( sb, "timeout (Default: -1)", 2 );
                append( sb, "Sets a timeout to the play invocation (in milliseconds). If not set (or set to -1, the plugin waits until the underlying play process completes. If set, the plugin kills the underlying play process when the timeout is reached, and it fails the build.", 3 );
                append( sb, "Expression: ${play2timeout}", 3 );
                append( sb, "", 0 );
            }
        }

        if ( goal == null || goal.length() <= 0 || "copy-dependencies".equals( goal ) )
        {
            append( sb, "dvn:copy-dependencies", 0 );
            append( sb, "Copy project dependencies to the lib folder.", 1 );
            append( sb, "", 0 );
            if ( detail )
            {
                append( sb, "Available parameters:", 1 );
                append( sb, "", 0 );

                append( sb, "lib (Default: lib)", 2 );
                append( sb, "Where are the dependencies copied.", 3 );
                append( sb, "", 0 );
            }
        }

        if ( goal == null || goal.length() <= 0 || "debug".equals( goal ) )
        {
            append( sb, "dvn:debug", 0 );
            append( sb, "Launch the Play application in debug mode (play debug run)", 1 );
            append( sb, "", 0 );
            if ( detail )
            {
                append( sb, "Available parameters:", 1 );
                append( sb, "", 0 );

                append( sb, "baseDirectory", 2 );
                append( sb, "Base directory of the project.", 3 );
                append( sb, "Expression: ${basedir}", 3 );
                append( sb, "", 0 );

                append( sb, "buildDirectory", 2 );
                append( sb, "Directory containing the build files.", 3 );
                append( sb, "Expression: ${project.build.directory}", 3 );
                append( sb, "", 0 );

                append( sb, "play2Home", 2 );
                append( sb, "The PLAY2_HOME path is taken from this setting, if not found as a Java system property (-DPLAY2_HOME). Refers to the PLAY2_HOME environment variable by default. So that means that the PLAY2_HOME can be given using:\n1.\tA system variable defined by the system or with -DPLAY2_HOME=...\n2.\tThe play2Home configuration property\n3.\tThe PLAY2_HOME environment property\n", 3 );
                append( sb, "Expression: ${env.PLAY2_HOME}", 3 );
                append( sb, "", 0 );

                append( sb, "play2SystemProperties", 2 );
                append( sb, "Allows customization of the play execution System properties.", 3 );
                append( sb, "", 0 );

                append( sb, "timeout (Default: -1)", 2 );
                append( sb, "Sets a timeout to the play invocation (in milliseconds). If not set (or set to -1, the plugin waits until the underlying play process completes. If set, the plugin kills the underlying play process when the timeout is reached, and it fails the build.", 3 );
                append( sb, "Expression: ${play2timeout}", 3 );
                append( sb, "", 0 );
            }
        }

        if ( goal == null || goal.length() <= 0 || "help".equals( goal ) )
        {
            append( sb, "dvn:help", 0 );
            append( sb, "Display help information on dvn.\nCall\n\u00a0\u00a0mvn\u00a0dvn:help\u00a0-Ddetail=true\u00a0-Dgoal=<goal-name>\nto display parameter details.", 1 );
            append( sb, "", 0 );
            if ( detail )
            {
                append( sb, "Available parameters:", 1 );
                append( sb, "", 0 );

                append( sb, "detail (Default: false)", 2 );
                append( sb, "If true, display all settable properties for each goal.", 3 );
                append( sb, "Expression: ${detail}", 3 );
                append( sb, "", 0 );

                append( sb, "goal", 2 );
                append( sb, "The name of the goal for which to show help. If unspecified, all goals will be displayed.", 3 );
                append( sb, "Expression: ${goal}", 3 );
                append( sb, "", 0 );

                append( sb, "indentSize (Default: 2)", 2 );
                append( sb, "The number of spaces per indentation level, should be positive.", 3 );
                append( sb, "Expression: ${indentSize}", 3 );
                append( sb, "", 0 );

                append( sb, "lineLength (Default: 80)", 2 );
                append( sb, "The maximum length of a display line, should be positive.", 3 );
                append( sb, "Expression: ${lineLength}", 3 );
                append( sb, "", 0 );
            }
        }

        if ( goal == null || goal.length() <= 0 || "install-play".equals( goal ) )
        {
            append( sb, "dvn:install-play", 0 );
            append( sb, "Download and install a Play! distribution.", 1 );
            append( sb, "", 0 );
            if ( detail )
            {
                append( sb, "Available parameters:", 1 );
                append( sb, "", 0 );

                append( sb, "play2basedir (Default: ${project.build.directory})", 2 );
                append( sb, "The directory where automatically installed Play! distributions are extracted. It\'s highly recommended that you set this configuration parameter to a directory of your choice. If not set its defaulted to project build directory. It means that a clean command will first downoad and install specified Play! distribution and then wipe it. After that next plugin goal will download and install again. It\'s not optimal but provides a default behavior that works. If set the plugin will download Play! distribution in this directory and extract them inside it.", 3 );
                append( sb, "Expression: ${play2basedir}", 3 );
                append( sb, "", 0 );

                append( sb, "play2version", 2 );
                append( sb, "Defines a Play! version to automatically install. If not set, PLAY2_HOME detection takes place and Play! is not automatically installed. If set the plugin will download and install specified Play! distribution. See the play2basedir configuration paramenter to set an install directory.", 3 );
                append( sb, "Expression: ${play2version}", 3 );
                append( sb, "", 0 );
            }
        }

        if ( goal == null || goal.length() <= 0 || "package".equals( goal ) )
        {
            append( sb, "dvn:package", 0 );
            append( sb, "Package the Play application. The application is packaged as a Jar file. It is also possible to create the distribution package (zip).", 1 );
            append( sb, "", 0 );
            if ( detail )
            {
                append( sb, "Available parameters:", 1 );
                append( sb, "", 0 );

                append( sb, "additionalFiles", 2 );
                append( sb, "Allows customization of the play packaging. The files specified in this attribute will get added to the distribution zip file. This allows, for example, to write your own start script and have it packaged in the distribution. This is done post-packaging by the play framework.", 3 );
                append( sb, "", 0 );

                append( sb, "attachDist (Default: true)", 2 );
                append( sb, "Enables or disables the attachment of the distribution file as an artifact to this project. This option has no impact if the distribution is not built.", 3 );
                append( sb, "", 0 );

                append( sb, "baseDirectory", 2 );
                append( sb, "Base directory of the project.", 3 );
                append( sb, "Expression: ${basedir}", 3 );
                append( sb, "", 0 );

                append( sb, "buildDirectory", 2 );
                append( sb, "Directory containing the build files.", 3 );
                append( sb, "Expression: ${project.build.directory}", 3 );
                append( sb, "", 0 );

                append( sb, "buildDist (Default: true)", 2 );
                append( sb, "Enables or disables the packaging of the whole distribution. The distribution is an autonomous archive containing all the files required to run the play application. Play 2 module can disable the distribution packaging.", 3 );
                append( sb, "", 0 );

                append( sb, "classifier", 2 );
                append( sb, "Output file classifier.", 3 );
                append( sb, "", 0 );

                append( sb, "deleteDist (Default: true)", 2 );
                append( sb, "Enables or disables the deletion of the dist folder after having packaged the application and copied the distribution file to target. It allows keeping the base directory cleaner.", 3 );
                append( sb, "", 0 );

                append( sb, "play2Home", 2 );
                append( sb, "The PLAY2_HOME path is taken from this setting, if not found as a Java system property (-DPLAY2_HOME). Refers to the PLAY2_HOME environment variable by default. So that means that the PLAY2_HOME can be given using:\n1.\tA system variable defined by the system or with -DPLAY2_HOME=...\n2.\tThe play2Home configuration property\n3.\tThe PLAY2_HOME environment property\n", 3 );
                append( sb, "Expression: ${env.PLAY2_HOME}", 3 );
                append( sb, "", 0 );

                append( sb, "play2SystemProperties", 2 );
                append( sb, "Allows customization of the play execution System properties.", 3 );
                append( sb, "", 0 );

                append( sb, "timeout (Default: -1)", 2 );
                append( sb, "Sets a timeout to the play invocation (in milliseconds). If not set (or set to -1, the plugin waits until the underlying play process completes. If set, the plugin kills the underlying play process when the timeout is reached, and it fails the build.", 3 );
                append( sb, "Expression: ${play2timeout}", 3 );
                append( sb, "", 0 );
            }
        }

        if ( goal == null || goal.length() <= 0 || "package-war".equals( goal ) )
        {
            append( sb, "dvn:package-war", 0 );
            append( sb, "Packages the Play application as War.", 1 );
            append( sb, "", 0 );
            if ( detail )
            {
                append( sb, "Available parameters:", 1 );
                append( sb, "", 0 );

                append( sb, "additionalFiles", 2 );
                append( sb, "Allows customization of the play packaging. The files specified in this attribute will get added to the distribution zip file. This allows, for example, to write your own start script and have it packaged in the distribution. This is done post-packaging by the play framework. This parameter is shared with the package mojo.", 3 );
                append( sb, "", 0 );

                append( sb, "baseDirectory", 2 );
                append( sb, "Base directory of the project.", 3 );
                append( sb, "Expression: ${basedir}", 3 );
                append( sb, "", 0 );

                append( sb, "buildDirectory", 2 );
                append( sb, "Directory containing the build files.", 3 );
                append( sb, "Expression: ${project.build.directory}", 3 );
                append( sb, "", 0 );

                append( sb, "buildWar (Default: true)", 2 );
                append( sb, "Enables or disabled the packaging of the application as a War file.", 3 );
                append( sb, "", 0 );

                append( sb, "play2Home", 2 );
                append( sb, "The PLAY2_HOME path is taken from this setting, if not found as a Java system property (-DPLAY2_HOME). Refers to the PLAY2_HOME environment variable by default. So that means that the PLAY2_HOME can be given using:\n1.\tA system variable defined by the system or with -DPLAY2_HOME=...\n2.\tThe play2Home configuration property\n3.\tThe PLAY2_HOME environment property\n", 3 );
                append( sb, "Expression: ${env.PLAY2_HOME}", 3 );
                append( sb, "", 0 );

                append( sb, "play2SystemProperties", 2 );
                append( sb, "Allows customization of the play execution System properties.", 3 );
                append( sb, "", 0 );

                append( sb, "pluginArtifacts", 2 );
                append( sb, "Dependencies of the current plugin. This list is used to extract and copy the servlet bridge.", 3 );
                append( sb, "Expression: ${plugin.artifacts}", 3 );
                append( sb, "", 0 );

                append( sb, "timeout (Default: -1)", 2 );
                append( sb, "Sets a timeout to the play invocation (in milliseconds). If not set (or set to -1, the plugin waits until the underlying play process completes. If set, the plugin kills the underlying play process when the timeout is reached, and it fails the build.", 3 );
                append( sb, "Expression: ${play2timeout}", 3 );
                append( sb, "", 0 );

                append( sb, "warClassifier", 2 );
                append( sb, "Sets the war classifier.", 3 );
                append( sb, "", 0 );

                append( sb, "webappDirectory (Default: ${project.build.directory}/${project.build.finalName})", 2 );
                append( sb, "The directory where the webapp is built.", 3 );
                append( sb, "", 0 );
            }
        }

        if ( goal == null || goal.length() <= 0 || "run".equals( goal ) )
        {
            append( sb, "dvn:run", 0 );
            append( sb, "Launch the Play application", 1 );
            append( sb, "", 0 );
            if ( detail )
            {
                append( sb, "Available parameters:", 1 );
                append( sb, "", 0 );

                append( sb, "baseDirectory", 2 );
                append( sb, "Base directory of the project.", 3 );
                append( sb, "Expression: ${basedir}", 3 );
                append( sb, "", 0 );

                append( sb, "buildDirectory", 2 );
                append( sb, "Directory containing the build files.", 3 );
                append( sb, "Expression: ${project.build.directory}", 3 );
                append( sb, "", 0 );

                append( sb, "play2Home", 2 );
                append( sb, "The PLAY2_HOME path is taken from this setting, if not found as a Java system property (-DPLAY2_HOME). Refers to the PLAY2_HOME environment variable by default. So that means that the PLAY2_HOME can be given using:\n1.\tA system variable defined by the system or with -DPLAY2_HOME=...\n2.\tThe play2Home configuration property\n3.\tThe PLAY2_HOME environment property\n", 3 );
                append( sb, "Expression: ${env.PLAY2_HOME}", 3 );
                append( sb, "", 0 );

                append( sb, "play2SystemProperties", 2 );
                append( sb, "Allows customization of the play execution System properties.", 3 );
                append( sb, "", 0 );

                append( sb, "timeout (Default: -1)", 2 );
                append( sb, "Sets a timeout to the play invocation (in milliseconds). If not set (or set to -1, the plugin waits until the underlying play process completes. If set, the plugin kills the underlying play process when the timeout is reached, and it fails the build.", 3 );
                append( sb, "Expression: ${play2timeout}", 3 );
                append( sb, "", 0 );
            }
        }

        if ( goal == null || goal.length() <= 0 || "test".equals( goal ) )
        {
            append( sb, "dvn:test", 0 );
            append( sb, "Run the test of the Play application. The tests are run using play test", 1 );
            append( sb, "", 0 );
            if ( detail )
            {
                append( sb, "Available parameters:", 1 );
                append( sb, "", 0 );

                append( sb, "baseDirectory", 2 );
                append( sb, "Base directory of the project.", 3 );
                append( sb, "Expression: ${basedir}", 3 );
                append( sb, "", 0 );

                append( sb, "buildDirectory", 2 );
                append( sb, "Directory containing the build files.", 3 );
                append( sb, "Expression: ${project.build.directory}", 3 );
                append( sb, "", 0 );

                append( sb, "play2Home", 2 );
                append( sb, "The PLAY2_HOME path is taken from this setting, if not found as a Java system property (-DPLAY2_HOME). Refers to the PLAY2_HOME environment variable by default. So that means that the PLAY2_HOME can be given using:\n1.\tA system variable defined by the system or with -DPLAY2_HOME=...\n2.\tThe play2Home configuration property\n3.\tThe PLAY2_HOME environment property\n", 3 );
                append( sb, "Expression: ${env.PLAY2_HOME}", 3 );
                append( sb, "", 0 );

                append( sb, "play2SystemProperties", 2 );
                append( sb, "Allows customization of the play execution System properties.", 3 );
                append( sb, "", 0 );

                append( sb, "skip (Default: false)", 2 );
                append( sb, "Set this to \'true\' to bypass unit tests entirely. Its use is NOT RECOMMENDED, especially if you enable it using the \'maven.test.skip\' property, because maven.test.skip disables both running the tests and compiling the tests. Consider using the skipTests parameter instead.", 3 );
                append( sb, "Expression: ${maven.test.skip}", 3 );
                append( sb, "", 0 );

                append( sb, "skipTests (Default: false)", 2 );
                append( sb, "Set this to \'true\' to skip running tests, but still compile them. Its use is NOT RECOMMENDED, but quite convenient on occasion.", 3 );
                append( sb, "Expression: ${skipTests}", 3 );
                append( sb, "", 0 );

                append( sb, "testFailureIgnore (Default: false)", 2 );
                append( sb, "Set this to \'true\' to ignore a failure during testing. Its use is NOT RECOMMENDED, but quite convenient on occasion.", 3 );
                append( sb, "Expression: ${maven.test.failure.ignore}", 3 );
                append( sb, "", 0 );

                append( sb, "timeout (Default: -1)", 2 );
                append( sb, "Sets a timeout to the play invocation (in milliseconds). If not set (or set to -1, the plugin waits until the underlying play process completes. If set, the plugin kills the underlying play process when the timeout is reached, and it fails the build.", 3 );
                append( sb, "Expression: ${play2timeout}", 3 );
                append( sb, "", 0 );
            }
        }

        if ( getLog().isInfoEnabled() )
        {
            getLog().info( sb.toString() );
        }
    }

    /**
     * <p>Repeat a String <code>n</code> times to form a new string.</p>
     *
     * @param str String to repeat
     * @param repeat number of times to repeat str
     * @return String with repeated String
     * @throws NegativeArraySizeException if <code>repeat < 0</code>
     * @throws NullPointerException if str is <code>null</code>
     */
    private static String repeat( String str, int repeat )
    {
        StringBuffer buffer = new StringBuffer( repeat * str.length() );

        for ( int i = 0; i < repeat; i++ )
        {
            buffer.append( str );
        }

        return buffer.toString();
    }

    /** 
     * Append a description to the buffer by respecting the indentSize and lineLength parameters.
     * <b>Note</b>: The last character is always a new line.
     * 
     * @param sb The buffer to append the description, not <code>null</code>.
     * @param description The description, not <code>null</code>.
     * @param indent The base indentation level of each line, must not be negative.
     */
    private void append( StringBuffer sb, String description, int indent )
    {
        for ( Iterator it = toLines( description, indent, indentSize, lineLength ).iterator(); it.hasNext(); )
        {
            sb.append( it.next().toString() ).append( '\n' );
        }
    }

    /** 
     * Splits the specified text into lines of convenient display length.
     * 
     * @param text The text to split into lines, must not be <code>null</code>.
     * @param indent The base indentation level of each line, must not be negative.
     * @param indentSize The size of each indentation, must not be negative.
     * @param lineLength The length of the line, must not be negative.
     * @return The sequence of display lines, never <code>null</code>.
     * @throws NegativeArraySizeException if <code>indent < 0</code>
     */
    private static List toLines( String text, int indent, int indentSize, int lineLength )
    {
        List lines = new ArrayList();

        String ind = repeat( "\t", indent );
        String[] plainLines = text.split( "(\r\n)|(\r)|(\n)" );
        for ( int i = 0; i < plainLines.length; i++ )
        {
            toLines( lines, ind + plainLines[i], indentSize, lineLength );
        }

        return lines;
    }

    /** 
     * Adds the specified line to the output sequence, performing line wrapping if necessary.
     * 
     * @param lines The sequence of display lines, must not be <code>null</code>.
     * @param line The line to add, must not be <code>null</code>.
     * @param indentSize The size of each indentation, must not be negative.
     * @param lineLength The length of the line, must not be negative.
     */
    private static void toLines( List lines, String line, int indentSize, int lineLength )
    {
        int lineIndent = getIndentLevel( line );
        StringBuffer buf = new StringBuffer( 256 );
        String[] tokens = line.split( " +" );
        for ( int i = 0; i < tokens.length; i++ )
        {
            String token = tokens[i];
            if ( i > 0 )
            {
                if ( buf.length() + token.length() >= lineLength )
                {
                    lines.add( buf.toString() );
                    buf.setLength( 0 );
                    buf.append( repeat( " ", lineIndent * indentSize ) );
                }
                else
                {
                    buf.append( ' ' );
                }
            }
            for ( int j = 0; j < token.length(); j++ )
            {
                char c = token.charAt( j );
                if ( c == '\t' )
                {
                    buf.append( repeat( " ", indentSize - buf.length() % indentSize ) );
                }
                else if ( c == '\u00A0' )
                {
                    buf.append( ' ' );
                }
                else
                {
                    buf.append( c );
                }
            }
        }
        lines.add( buf.toString() );
    }

    /** 
     * Gets the indentation level of the specified line.
     * 
     * @param line The line whose indentation level should be retrieved, must not be <code>null</code>.
     * @return The indentation level of the line.
     */
    private static int getIndentLevel( String line )
    {
        int level = 0;
        for ( int i = 0; i < line.length() && line.charAt( i ) == '\t'; i++ )
        {
            level++;
        }
        for ( int i = level + 1; i <= level + 4 && i < line.length(); i++ )
        {
            if ( line.charAt( i ) == '\t' )
            {
                level++;
                break;
            }
        }
        return level;
    }
}
