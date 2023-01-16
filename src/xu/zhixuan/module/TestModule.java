package xu.zhixuan.module;

import xu.zhixuan.wulne.Module.Module;
import xu.zhixuan.wulne.Module.ModuleType;

public class TestModule extends Module {
    public TestModule() {
        super("test",0,0,ModuleType.Other,false);
    }

    @Override
    public void onEnabled() {
        mc.thePlayer.sendChatMessage("Hello World");
    }
}
