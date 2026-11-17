package com.facebook.aura.feed.repo;

import X.A64;
import X.AbstractC7559F3s;
import X.C9hr;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class FeedAttachmentJson$Companion$$childSerializers$3 extends AbstractC7559F3s implements Function0<C9hr<List<? extends FeedSocialMediaItemJson>>> {
    public static final FeedAttachmentJson$Companion$$childSerializers$3 INSTANCE = new FeedAttachmentJson$Companion$$childSerializers$3();

    public FeedAttachmentJson$Companion$$childSerializers$3() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C9hr<List<? extends FeedSocialMediaItemJson>> invoke() {
        return new A64(FeedSocialMediaItemJson$$serializer.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<List<? extends FeedSocialMediaItemJson>> invoke() {
        return new A64(FeedSocialMediaItemJson$$serializer.INSTANCE);
    }
}
