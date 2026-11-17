package com.facebook.aura.navigation.key;

import X.AbstractC7559F3s;
import X.C9hr;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ContentViewerScreenKey$Companion$$childSerializers$1 extends AbstractC7559F3s implements Function0<C9hr<ContentViewerTarget>> {
    public static final ContentViewerScreenKey$Companion$$childSerializers$1 INSTANCE = new ContentViewerScreenKey$Companion$$childSerializers$1();

    public ContentViewerScreenKey$Companion$$childSerializers$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C9hr<ContentViewerTarget> invoke() {
        return ContentViewerTarget.Companion.serializer();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<ContentViewerTarget> invoke() {
        return ContentViewerTarget.Companion.serializer();
    }
}
