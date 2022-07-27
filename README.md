# sbt multi-command reload

This repository demonstrates an issue with sbt. After
[running multiple commands in triggered execution mode](https://www.scala-sbt.org/1.x/docs/Triggered-Execution.html#Running+Multiple+Commands),
and triggering an automatic reload with a change to `build.sbt`, the first command is not run again after the reload
completes.

To reproduce the issue with this repository:

1. Run `sbt` to load the sbt shell
2. In the sbt shell, start all three projects in triggered execution mode:
    ```
    ~ proj1/reStart; proj2/reStart; proj3/reStart
    ```
    1. After all apps start, you should see `proj 1`, `proj 2`, and `proj 3` each being printed every second
3. In your text editor, open `build.sbt`, add another blank line at the bottom of the file, and save it
4. Watch the terminal after sbt reloads
    1. You should now only see `proj 2` and `proj 3` being printed every second -- `proj 1` was not started
