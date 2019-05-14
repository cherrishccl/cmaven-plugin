package com.cherrish;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import java.util.List;

/**
 * @author cherrish
 * @name CMavenMojo
 * @date 2019/5/14 8:52
 * @desc TODO
 */
@Mojo(name = "ctest", defaultPhase = LifecyclePhase.PACKAGE)
public class CMavenMojo extends AbstractMojo {
    @Parameter
    private String myarg;

    @Parameter
    private List<String> listArgs;

    /**
     * 设置命令行参数
     */
    @Parameter(property = "args")
    private String args;

    public void execute() throws MojoExecutionException, MojoFailureException {
        String tips = "-------------------------------------\n"+
                      "|** My self define maven-plugin.. **|\n"+
                      "-------------------------------------";
        System.out.println(tips);
        System.out.println("My arg = "+ myarg);
        System.out.println("My List args = "+ listArgs);
        System.out.println("My cmd args = "+ args);

    }
}
