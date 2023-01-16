package xu.zhixuan.command;

import net.minecraft.client.Minecraft;
import xu.zhixuan.wulne.Command.Command;

public class testCommand extends Command {
    public testCommand() {
        super("test",new String[] {"test"});
    }

    @Override
    public void run(String[] args) {
        Minecraft.getMinecraft().thePlayer.sendChatMessage("Hello World");
    }
}
