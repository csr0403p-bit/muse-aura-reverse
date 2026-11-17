package com.facebook.rsys.metaaivoicestate.feature.gen;

import X.AbstractC7607F5u;
import X.AbstractC7608F5v;
import X.ETi;
import X.GWI;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.msys.mci.Execution;
import com.facebook.rsys.base.gen.FeatureHolder;
import com.facebook.rsys.metaaivoicestate.gen.MetaAiMediaStatsProxy;
import com.facebook.rsys.metaaivoicestate.gen.MetaAiVoiceStateProxy;
import com.facebook.rsys.metaaivoicestate.gen.MetaAiWearableAppEventsProxy;

/* loaded from: classes6.dex */
public abstract class MetaAiVoiceStateFeatureFactory {

    public final class CProxy extends MetaAiVoiceStateFeatureFactory {
        public static native FeatureHolder create(MetaAiVoiceStateProxy metaAiVoiceStateProxy, MetaAiMediaStatsProxy metaAiMediaStatsProxy, MetaAiWearableAppEventsProxy metaAiWearableAppEventsProxy, String str);

        public static native MetaAiVoiceStateFeatureFactory createFromMcfType(McfReference mcfReference);

        public static native FeatureHolder createWithRealtimeProtocol(MetaAiVoiceStateProxy metaAiVoiceStateProxy, MetaAiMediaStatsProxy metaAiMediaStatsProxy, MetaAiWearableAppEventsProxy metaAiWearableAppEventsProxy, String str, boolean z);

        public static native long nativeGetMcfTypeId();

        static {
            if (GWI.A00) {
                return;
            }
            try {
                AbstractC7607F5u.A1F();
                Execution.initialize();
                ETi.loadLibrary("jniperflogger");
                ETi.loadLibrary("rsysfeaturemetaaivoicestatejniLatest");
                GWI.A00 = true;
            } catch (ClassNotFoundException e) {
                throw AbstractC7608F5v.A0m(e);
            }
        }
    }
}
