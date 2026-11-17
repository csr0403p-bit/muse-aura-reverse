package com.facebook.aura.navigation.key;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.C79;
import X.C9dz;
import X.C9hr;
import X.F0C;
import com.facebook.aura.navigation.AuraNavKey;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class LocalBrowserSettingsScreenKey implements AuraNavKey {
    public static final int $stable = 0;
    public static final LocalBrowserSettingsScreenKey INSTANCE = new LocalBrowserSettingsScreenKey();
    public static final /* synthetic */ F0C<C9hr<Object>> $cachedSerializer$delegate = AbstractC5321DgF.A02(C79.A01, new Function0() { // from class: com.facebook.aura.navigation.key.LocalBrowserSettingsScreenKey$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return LocalBrowserSettingsScreenKey._init_$_anonymous_();
        }
    });

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof LocalBrowserSettingsScreenKey);
    }

    public static final /* synthetic */ C9hr _init_$_anonymous_() {
        return new C9dz(INSTANCE, "com.facebook.aura.navigation.key.LocalBrowserSettingsScreenKey", new Annotation[0]);
    }

    private final /* synthetic */ C9hr get$cachedSerializer() {
        return AnonymousClass001.A12($cachedSerializer$delegate);
    }

    public final C9hr<LocalBrowserSettingsScreenKey> serializer() {
        return AnonymousClass001.A12($cachedSerializer$delegate);
    }

    public String toString() {
        return "LocalBrowserSettingsScreenKey";
    }

    public int hashCode() {
        return -26189062;
    }
}
