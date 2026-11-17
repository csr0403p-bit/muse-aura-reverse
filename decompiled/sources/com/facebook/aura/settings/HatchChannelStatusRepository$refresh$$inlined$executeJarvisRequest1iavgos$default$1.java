package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.C9hr;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.settings.HatchChannelStatusRepository$refresh$$inlined$executeJarvisRequest-1iavgos$default$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class HatchChannelStatusRepository$refresh$$inlined$executeJarvisRequest1iavgos$default$1 extends AbstractC7559F3s implements Function0<C9hr<ChannelsPayloadJson>> {
    public static final HatchChannelStatusRepository$refresh$$inlined$executeJarvisRequest1iavgos$default$1 INSTANCE = new HatchChannelStatusRepository$refresh$$inlined$executeJarvisRequest1iavgos$default$1();

    public HatchChannelStatusRepository$refresh$$inlined$executeJarvisRequest1iavgos$default$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C9hr<ChannelsPayloadJson> invoke() {
        int i = ChannelsPayloadJson.$stable;
        return ChannelsPayloadJson$$serializer.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<ChannelsPayloadJson> invoke() {
        int i = ChannelsPayloadJson.$stable;
        return ChannelsPayloadJson$$serializer.INSTANCE;
    }
}
