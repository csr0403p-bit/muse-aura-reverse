package com.facebook.aura.partners.voice.session.impl;

import X.AGH;
import X.AnonymousClass002;
import X.C06H;
import X.C7384Etj;
import X.C7LE;
import X.FGI;
import android.os.SystemClock;
import com.facebook.aura.threadvoicecaption.ThreadAssistantCaption;
import java.util.Map;

/* loaded from: classes2.dex */
public final class CaptionCadence {

    @Deprecated
    public static final int BURST_MIN_WORDS = 3;

    @Deprecated
    public static final long BURST_WINDOW_MS = 100;
    public static final Companion Companion = new Companion();

    @Deprecated
    public static final int STALL_MIN_GAP_MS = 1000;
    public boolean audioAtLastGrowth;
    public long burstEndsAtMs;
    public int burstWords;
    public int bursts;
    public long lastGrowthAtMs;
    public int maxBurstWords;
    public int maxGapMs;
    public String messageId;
    public int messageWords;
    public final String prefix;
    public int stalls;
    public int words;

    public CaptionCadence(String str) {
        C7384Etj.A0Y(str, 0);
        this.prefix = str;
    }

    public final void onCaption(ThreadAssistantCaption threadAssistantCaption, boolean z) {
        C7384Etj.A0Y(threadAssistantCaption, 0);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (!C7384Etj.areEqual(threadAssistantCaption.messageId, this.messageId)) {
            this.messageId = threadAssistantCaption.messageId;
            this.messageWords = 0;
            this.lastGrowthAtMs = jElapsedRealtime;
            this.burstEndsAtMs = 0L;
        }
        int iWordCount = wordCount(threadAssistantCaption.text);
        int i = iWordCount - this.messageWords;
        this.messageWords = iWordCount;
        if (i > 0) {
            this.words += i;
            int i2 = (z || this.audioAtLastGrowth) ? (int) (jElapsedRealtime - this.lastGrowthAtMs) : 0;
            this.lastGrowthAtMs = jElapsedRealtime;
            this.audioAtLastGrowth = z;
            this.maxGapMs = Math.max(this.maxGapMs, i2);
            if (i2 >= 1000) {
                this.stalls++;
                this.burstEndsAtMs = 100 + jElapsedRealtime;
                this.burstWords = 0;
            }
            if (jElapsedRealtime <= this.burstEndsAtMs) {
                int i3 = this.burstWords;
                if (i3 < 3 && i3 + i >= 3) {
                    this.bursts++;
                }
                int i4 = i3 + i;
                this.burstWords = i4;
                this.maxBurstWords = Math.max(this.maxBurstWords, i4);
            }
        }
    }

    public final Map<String, Integer> annotations() {
        String str = this.prefix;
        return AGH.A0D(AnonymousClass002.A0p(FGI.A0M(str, "_words"), this.words), AnonymousClass002.A0p(FGI.A0M(str, "_stalls"), this.stalls), AnonymousClass002.A0p(FGI.A0M(str, "_bursts"), this.bursts), AnonymousClass002.A0p(FGI.A0M(str, "_max_gap_ms"), this.maxGapMs), AnonymousClass002.A0p(FGI.A0M(str, "_max_burst_words"), this.maxBurstWords));
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    private final int wordCount(String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        char c = ' ';
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (!C7LE.A00(cCharAt) && C7LE.A00(c)) {
                i2++;
            }
            i++;
            c = cCharAt;
        }
        return i2;
    }
}
