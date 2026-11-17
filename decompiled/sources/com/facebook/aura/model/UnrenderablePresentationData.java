package com.facebook.aura.model;

import X.AbstractC5321DgF;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C79;
import X.C9dz;
import X.C9hr;
import X.F0C;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class UnrenderablePresentationData implements HatchPresentationData {
    public static final int $stable = 0;
    public static final UnrenderablePresentationData INSTANCE = new UnrenderablePresentationData();
    public static final /* synthetic */ F0C<C9hr<Object>> $cachedSerializer$delegate = AbstractC5321DgF.A02(C79.A01, AnonymousClass1.INSTANCE);

    /* renamed from: com.facebook.aura.model.UnrenderablePresentationData$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<C9hr<Object>> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final C9hr<Object> invoke() {
            return new C9dz(UnrenderablePresentationData.INSTANCE, "com.facebook.aura.model.UnrenderablePresentationData", new Annotation[0]);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof UnrenderablePresentationData);
    }

    private final /* synthetic */ C9hr get$cachedSerializer() {
        return AnonymousClass001.A12($cachedSerializer$delegate);
    }

    public final C9hr<UnrenderablePresentationData> serializer() {
        return AnonymousClass001.A12($cachedSerializer$delegate);
    }

    public String toString() {
        return "UnrenderablePresentationData";
    }

    public int hashCode() {
        return 1558398498;
    }
}
