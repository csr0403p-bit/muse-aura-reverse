package com.facebook.aura.model;

import X.C9hr;
import kotlinx.serialization.Serializable;

@Serializable(with = HatchWidgetDataSerializer.class)
/* loaded from: classes3.dex */
public interface HatchWidgetData {
    public static final Companion Companion = Companion.$$INSTANCE;

    public final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        public final C9hr<HatchWidgetData> serializer() {
            return HatchWidgetDataSerializer.INSTANCE;
        }
    }
}
