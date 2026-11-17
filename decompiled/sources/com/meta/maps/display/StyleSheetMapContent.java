package com.meta.maps.display;

import X.AnonymousClass003;
import X.C06H;
import com.meta.maps.NativeBase;

/* loaded from: classes4.dex */
public final class StyleSheetMapContent extends MapContent {
    public static final Companion Companion = new Companion();

    private final native void cacheThisInstance();

    public static final native long create(String str, String str2);

    public final native void updateWithDefinitions(String str);

    public final class Companion {
        public final long create(String str, String str2) {
            return StyleSheetMapContent.create(str, str2);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StyleSheetMapContent(String str, String str2) {
        super(create(str, str2), (NativeBase.Disposer) MapContent.Companion);
        AnonymousClass003.A0u(str, str2);
        cacheThisInstance();
    }

    public StyleSheetMapContent(long j, Object obj) {
        super(j, (NativeBase.Disposer) MapContent.Companion);
    }
}
