package xu.zhixuan;

import xu.zhixuan.command.testCommand;
import xu.zhixuan.module.TestModule;
import xu.zhixuan.wulne.Api.plugin.PluginBase;
import xu.zhixuan.wulne.Command.CommandManager;
import xu.zhixuan.wulne.Module.ModuleManager;
import xu.zhixuan.wulne.WulneJvav;

public class Plugin implements PluginBase {
    @Override
    public String getAuthor() {
        return "Test";
    }

    @Override
    public String getName() {
        return "Test";
    }

    @Override
    public String getVersion() {
        return "1.0";
    }

    @Override
    public void getCommandManager(CommandManager commandManager) {
        commandManager.commands.add(new testCommand());
    }

    @Override
    public void getModuleManager(ModuleManager moduleManager) {
        moduleManager.modules.add(new TestModule());
    }

    @Override
    public void onStart(WulneJvav wulneJvav) {

    }

    @Override
    public void onStop(WulneJvav wulneJvav) {

    }
}
