package com.facebook.aura.sharesheet;

import X.AbstractC7559F3s;
import X.C3cG;
import X.C9hr;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ShareRecipientsResponseJson$Companion$$childSerializers$1 extends AbstractC7559F3s implements Function0<C9hr<List<? extends ShareRecipientJson>>> {
    public static final ShareRecipientsResponseJson$Companion$$childSerializers$1 INSTANCE = new ShareRecipientsResponseJson$Companion$$childSerializers$1();

    public ShareRecipientsResponseJson$Companion$$childSerializers$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C9hr<List<? extends ShareRecipientJson>> invoke() {
        return C3cG.A19(ShareRecipientJson$$serializer.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<List<? extends ShareRecipientJson>> invoke() {
        return C3cG.A19(ShareRecipientJson$$serializer.INSTANCE);
    }
}
