package com.facebook.aura.sharesheet;

import X.AbstractC7559F3s;
import X.C9hr;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.sharesheet.HatchShareSheetRepository$attemptMessageShare$$inlined$executeJarvisRequest-Z6QaZII$default$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class HatchShareSheetRepository$attemptMessageShare$$inlined$executeJarvisRequestZ6QaZII$default$1 extends AbstractC7559F3s implements Function0<C9hr<MessageShareAttemptRequestJson>> {
    public static final HatchShareSheetRepository$attemptMessageShare$$inlined$executeJarvisRequestZ6QaZII$default$1 INSTANCE = new HatchShareSheetRepository$attemptMessageShare$$inlined$executeJarvisRequestZ6QaZII$default$1();

    public HatchShareSheetRepository$attemptMessageShare$$inlined$executeJarvisRequestZ6QaZII$default$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C9hr<MessageShareAttemptRequestJson> invoke() {
        return MessageShareAttemptRequestJson$$serializer.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<MessageShareAttemptRequestJson> invoke() {
        return MessageShareAttemptRequestJson$$serializer.INSTANCE;
    }
}
