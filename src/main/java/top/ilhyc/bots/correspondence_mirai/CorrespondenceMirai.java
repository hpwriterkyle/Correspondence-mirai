package top.ilhyc.bots.correspondence_mirai;

import net.mamoe.mirai.console.plugin.jvm.JavaPlugin;
import net.mamoe.mirai.console.plugin.jvm.JvmPluginDescription;
import net.mamoe.mirai.console.plugin.jvm.JvmPluginDescriptionBuilder;
import net.mamoe.mirai.event.Event;
import net.mamoe.mirai.event.EventChannel;
import net.mamoe.mirai.event.GlobalEventChannel;
import net.mamoe.mirai.event.events.FriendMessageEvent;
import net.mamoe.mirai.event.events.GroupMessageEvent;

public final class CorrespondenceMirai extends JavaPlugin {
    public static final CorrespondenceMirai INSTANCE = new CorrespondenceMirai();
    private CorrespondenceMirai() {
        super(new JvmPluginDescriptionBuilder("top.ilhyc.bots.correspondence-mirai", "0.1.0")
                .info("start")
                .name("correspondence-mirai")
                .author("qq为1853699150")
                .build());
    }

    @Override
    public void onEnable() {
        EventChannel<Event> eventChannel = GlobalEventChannel.INSTANCE.parentScope(this);
        eventChannel.subscribeAlways(GroupMessageEvent.class, g -> {
            //监听群消息
        });
        eventChannel.subscribeAlways(FriendMessageEvent.class, f -> {
            //监听好友消息
        });
    }
}
