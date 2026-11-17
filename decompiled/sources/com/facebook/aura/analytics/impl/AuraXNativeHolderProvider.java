package com.facebook.aura.analytics.impl;

import X.AnonymousClass003;
import X.AnonymousClass004;
import X.BV4;
import X.BV5;
import X.C06H;
import X.C3341CFl;
import X.C4934DFk;
import X.C5065DTb;
import X.C7384Etj;
import X.CFI;
import X.CFK;
import X.DFW;
import X.DFX;
import X.DJU;
import android.util.JsonReader;
import android.util.JsonToken;
import com.facebook.xanalytics.XAnalyticsAdapter;
import com.facebook.xanalytics.XAnalyticsAdapterHolder;
import com.facebook.xanalytics.XAnalyticsHolder;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class AuraXNativeHolderProvider implements DJU {
    public static final Companion Companion = new Companion();
    public static final String TAG = "AuraXNativeHolderProvider";
    public final Function0<DFX> analytics2LoggerProvider;
    public final XAnalyticsAdapterHolder xAnalyticsAdapter;

    public final class Companion {
        /* JADX INFO: Access modifiers changed from: private */
        public final void processJson(String str, String str2, DFW dfw) throws IOException {
            try {
                ByteArrayInputStream byteArrayInputStreamA0E = BV4.A0E(str2.getBytes(C7384Etj.A0M("UTF8")));
                try {
                    JsonReader jsonReader = new JsonReader(new InputStreamReader(byteArrayInputStreamA0E));
                    try {
                        C3341CFl c3341CFlA04 = dfw.A04();
                        C7384Etj.A0U(c3341CFlA04);
                        C7384Etj.A0Y(str, 0);
                        if (jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                            jsonReader.beginObject();
                            CFI.A01(jsonReader, c3341CFlA04, CFI.A00);
                        }
                        jsonReader.close();
                        byteArrayInputStreamA0E.close();
                    } finally {
                    }
                } finally {
                }
            } catch (IOException e) {
                CFK.A0C(AuraXNativeHolderProvider.TAG, "IOException from processJson : %s ", e, str2);
            } catch (AssertionError e2) {
                CFK.A0C(AuraXNativeHolderProvider.TAG, "AssertionError from JsonReader.peek() for : %s ", e2, str2);
                throw e2;
            }
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AuraXNativeHolderProvider(Function0<? extends DFX> function0) {
        C7384Etj.A0Y(function0, 0);
        this.analytics2LoggerProvider = function0;
        C5065DTb c5065DTb = XAnalyticsAdapterHolder.Companion;
        this.xAnalyticsAdapter = new XAnalyticsAdapterHolder(new XAnalyticsAdapter() { // from class: com.facebook.aura.analytics.impl.AuraXNativeHolderProvider$xAnalyticsAdapter$1
            @Override // com.facebook.xanalytics.XAnalyticsAdapter
            public void cleanup() {
            }

            @Override // com.facebook.xanalytics.XAnalyticsAdapter
            public void flush() {
            }

            @Override // com.facebook.xanalytics.XAnalyticsAdapter
            public boolean shouldLog(String str) {
                C7384Etj.A0Y(str, 0);
                int i = this.this$0.analytics2LoggerProvider.invoke().A02.shouldLog(str).A00;
                if (i >= 0) {
                    return i != 0 && C4934DFk.A06.nextInt(i) == 0;
                }
                throw BV5.A0Q("Not sure how to proceed with negative sampling rate ", i);
            }

            @Override // com.facebook.xanalytics.XAnalyticsAdapter
            public String getStructureSamplingConfig(String str) {
                return "";
            }

            @Override // com.facebook.xanalytics.XAnalyticsAdapter
            public void logEvent(String str, String str2, String str3, boolean z, double d) throws IOException {
                AnonymousClass003.A0u(str, str2);
                DFW dfwA04 = this.this$0.analytics2LoggerProvider.invoke().A04(str, z);
                if (dfwA04.A0A()) {
                    dfwA04.A03 = 16 | dfwA04.A03;
                    AuraXNativeHolderProvider.Companion.processJson(str, str2, dfwA04);
                    dfwA04.A05();
                }
            }

            @Override // com.facebook.xanalytics.XAnalyticsAdapter
            public void logEventBypassSampling(String str, String str2) throws IOException {
                DFW dfwA04 = this.this$0.analytics2LoggerProvider.invoke().A04(str, AnonymousClass004.A1b(str, str2));
                dfwA04.A03 = 16 | dfwA04.A03;
                AuraXNativeHolderProvider.Companion.processJson(str, str2, dfwA04);
                dfwA04.A05();
            }

            @Override // com.facebook.xanalytics.XAnalyticsAdapter
            public void logCounter(String str, double d) {
            }

            @Override // com.facebook.xanalytics.XAnalyticsAdapter
            public void logCounter(String str, double d, String str2) {
            }
        });
    }

    @Override // X.DJU
    public XAnalyticsHolder getXAnalyticsNative() {
        return this.xAnalyticsAdapter;
    }
}
