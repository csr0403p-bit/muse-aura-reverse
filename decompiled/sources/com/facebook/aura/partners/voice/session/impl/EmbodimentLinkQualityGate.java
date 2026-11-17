package com.facebook.aura.partners.voice.session.impl;

import X.AbstractC0878AGe;
import X.AnonymousClass002;
import X.C06H;
import X.C3cG;
import X.C7384Etj;
import X.Ey9;
import com.facebook.rsys.mediastats.gen.MediaStats;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class EmbodimentLinkQualityGate {

    @Deprecated
    public static final double CLEAN_CONCEALED_PCT = 2.0d;

    @Deprecated
    public static final double CLEAN_LOSS_PCT = 1.0d;

    @Deprecated
    public static final long CLEAN_RTT_MS = 400;

    @Deprecated
    public static final int CLEAN_WINDOWS_TO_RESUME = 6;
    public static final Companion Companion = new Companion();

    @Deprecated
    public static final int MAX_SUPPRESSIONS = 2;

    @Deprecated
    public static final double MIN_AUDIO_PACKETS_PER_SEC = 2.0d;

    @Deprecated
    public static final double POOR_CONCEALED_PCT = 8.0d;

    @Deprecated
    public static final double POOR_LOSS_PCT = 5.0d;

    @Deprecated
    public static final long POOR_RTT_MS = 1000;

    @Deprecated
    public static final int POOR_WINDOWS_TO_SUPPRESS = 3;
    public boolean audioEverReceived;
    public int cleanStreak;
    public final int maxSuppressions;
    public int poorStreak;
    public AudioCounters previous;
    public boolean suppressed;
    public int suppressionCount;

    public final class AudioCounters {
        public static final Companion Companion = new Companion();
        public final long concealedSamples;
        public final long elapsedRealtimeMs;
        public final long packetsLost;
        public final long packetsReceived;
        public final Long rttMs;
        public final long totalSamples;

        public final LinkGrade gradeSince(AudioCounters audioCounters) {
            Long l;
            C7384Etj.A0Y(audioCounters, 0);
            long j = this.elapsedRealtimeMs - audioCounters.elapsedRealtimeMs;
            if (j <= 0) {
                return LinkGrade.UNKNOWN;
            }
            long j2 = this.packetsReceived - audioCounters.packetsReceived;
            if (j2 < 0) {
                j2 = 0;
            }
            long j3 = this.packetsLost - audioCounters.packetsLost;
            if (j3 < 0) {
                j3 = 0;
            }
            double d = j2 + j3;
            if ((1000.0d * d) / j < 2.0d) {
                return LinkGrade.STALLED;
            }
            double d2 = (j3 * 100.0d) / d;
            long j4 = this.totalSamples - audioCounters.totalSamples;
            if (j4 < 0) {
                j4 = 0;
            }
            long j5 = this.concealedSamples - audioCounters.concealedSamples;
            if (j5 < 0) {
                j5 = 0;
            }
            double d3 = j4 > 0 ? (j5 * 100.0d) / j4 : 0.0d;
            return (d2 >= 5.0d || d3 >= 8.0d || ((l = this.rttMs) != null && l.longValue() >= 1000)) ? LinkGrade.POOR : (d2 >= 1.0d || d3 >= 2.0d || (l != null && l.longValue() >= 400)) ? LinkGrade.FAIR : LinkGrade.CLEAN;
        }

        public final class Companion {
            public final AudioCounters from(List<? extends MediaStats> list, long j) {
                C7384Etj.A0Y(list, 0);
                Iterator<? extends MediaStats> it = list.iterator();
                boolean z = false;
                long jLongValue = 0;
                boolean z2 = false;
                while (it.hasNext()) {
                    Long l = it.next().audioPacketsReceived;
                    if (l != null) {
                        jLongValue += l.longValue();
                        z2 = true;
                    }
                }
                if (!z2) {
                    return null;
                }
                long jLongValue2 = Long.valueOf(jLongValue).longValue();
                Iterator<? extends MediaStats> it2 = list.iterator();
                long jLongValue3 = 0;
                boolean z3 = false;
                while (it2.hasNext()) {
                    Long l2 = it2.next().audioPacketsLost;
                    if (l2 != null) {
                        jLongValue3 += l2.longValue();
                        z3 = true;
                    }
                }
                long jLongValue4 = z3 ? Long.valueOf(jLongValue3).longValue() : 0L;
                Iterator<? extends MediaStats> it3 = list.iterator();
                long jLongValue5 = 0;
                boolean z4 = false;
                while (it3.hasNext()) {
                    Long l3 = it3.next().concealedSamples;
                    if (l3 != null) {
                        jLongValue5 += l3.longValue();
                        z4 = true;
                    }
                }
                long jLongValue6 = z4 ? Long.valueOf(jLongValue5).longValue() : 0L;
                Iterator<? extends MediaStats> it4 = list.iterator();
                long jLongValue7 = 0;
                while (it4.hasNext()) {
                    Long l4 = it4.next().totalSamplesReceived;
                    if (l4 != null) {
                        jLongValue7 += l4.longValue();
                        z = true;
                    }
                }
                long jLongValue8 = z ? Long.valueOf(jLongValue7).longValue() : 0L;
                ArrayList arrayListA0h = C3cG.A0h();
                Iterator<? extends MediaStats> it5 = list.iterator();
                while (it5.hasNext()) {
                    Long l5 = it5.next().curRttMs;
                    if (l5 != null) {
                        arrayListA0h.add(l5);
                    }
                }
                return new AudioCounters(j, jLongValue2, jLongValue4, jLongValue6, jLongValue8, (Long) AbstractC0878AGe.A07(arrayListA0h));
            }

            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public final long getConcealedSamples() {
            return this.concealedSamples;
        }

        public final long getElapsedRealtimeMs() {
            return this.elapsedRealtimeMs;
        }

        public final long getPacketsLost() {
            return this.packetsLost;
        }

        public final long getPacketsReceived() {
            return this.packetsReceived;
        }

        public final Long getRttMs() {
            return this.rttMs;
        }

        public final long getTotalSamples() {
            return this.totalSamples;
        }

        public AudioCounters(long j, long j2, long j3, long j4, long j5, Long l) {
            this.elapsedRealtimeMs = j;
            this.packetsReceived = j2;
            this.packetsLost = j3;
            this.concealedSamples = j4;
            this.totalSamples = j5;
            this.rttMs = l;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class LinkGrade {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ LinkGrade[] $VALUES;
        public static final LinkGrade CLEAN;
        public static final LinkGrade FAIR;
        public static final LinkGrade POOR;
        public static final LinkGrade STALLED;
        public static final LinkGrade UNKNOWN;

        static {
            LinkGrade linkGrade = new LinkGrade("UNKNOWN", 0);
            UNKNOWN = linkGrade;
            LinkGrade linkGrade2 = new LinkGrade("STALLED", 1);
            STALLED = linkGrade2;
            LinkGrade linkGrade3 = new LinkGrade("POOR", 2);
            POOR = linkGrade3;
            LinkGrade linkGrade4 = new LinkGrade("FAIR", 3);
            FAIR = linkGrade4;
            LinkGrade linkGrade5 = new LinkGrade("CLEAN", 4);
            CLEAN = linkGrade5;
            LinkGrade[] linkGradeArr = {linkGrade, linkGrade2, linkGrade3, linkGrade4, linkGrade5};
            $VALUES = linkGradeArr;
            $ENTRIES = C3cG.A0w(linkGradeArr);
        }

        public static Ey9<LinkGrade> getEntries() {
            return $ENTRIES;
        }

        public static LinkGrade valueOf(String str) {
            return (LinkGrade) Enum.valueOf(LinkGrade.class, str);
        }

        public static LinkGrade[] values() {
            return (LinkGrade[]) $VALUES.clone();
        }

        public LinkGrade(String str, int i) {
        }
    }

    public EmbodimentLinkQualityGate() {
        this(2);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean onMediaStats(java.util.List<? extends com.facebook.rsys.mediastats.gen.MediaStats> r14, long r15) {
        /*
            r13 = this;
            r4 = 0
            X.C7384Etj.A0Y(r14, r4)
            com.facebook.aura.partners.voice.session.impl.EmbodimentLinkQualityGate$AudioCounters$Companion r0 = com.facebook.aura.partners.voice.session.impl.EmbodimentLinkQualityGate.AudioCounters.Companion
            r1 = r15
            com.facebook.aura.partners.voice.session.impl.EmbodimentLinkQualityGate$AudioCounters r12 = r0.from(r14, r1)
            r11 = 0
            if (r12 == 0) goto L7e
            com.facebook.aura.partners.voice.session.impl.EmbodimentLinkQualityGate$AudioCounters r10 = r13.previous
            r13.previous = r12
            boolean r9 = r13.audioEverReceived
            r5 = 1
            r8 = 2
            if (r9 != 0) goto L21
            long r6 = r12.packetsReceived
            r2 = 0
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            r0 = 0
            if (r1 <= 0) goto L22
        L21:
            r0 = 1
        L22:
            r13.audioEverReceived = r0
            if (r10 == 0) goto L7e
            if (r9 == 0) goto L7e
            com.facebook.aura.partners.voice.session.impl.EmbodimentLinkQualityGate$LinkGrade r0 = r12.gradeSince(r10)
            int r1 = r0.ordinal()
            r3 = 3
            if (r1 == r8) goto L4b
            r0 = 4
            if (r1 == r0) goto L41
            if (r1 == r3) goto L52
            if (r1 == r5) goto L52
            if (r1 == r4) goto L7e
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        L41:
            int r0 = r13.cleanStreak
            int r2 = r0 + 1
            r13.cleanStreak = r2
            r13.poorStreak = r4
            r1 = 0
            goto L58
        L4b:
            int r0 = r13.poorStreak
            int r1 = r0 + 1
            r13.poorStreak = r1
            goto L55
        L52:
            r13.poorStreak = r4
            r1 = 0
        L55:
            r13.cleanStreak = r4
            r2 = 0
        L58:
            boolean r0 = r13.suppressed
            if (r0 != 0) goto L6d
            if (r1 < r3) goto L7e
            r13.suppressed = r5
            int r0 = r13.suppressionCount
            int r0 = r0 + 1
            r13.suppressionCount = r0
            r13.poorStreak = r4
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r5)
            return r11
        L6d:
            int r1 = r13.suppressionCount
            int r0 = r13.maxSuppressions
            if (r1 >= r0) goto L7e
            r0 = 6
            if (r2 < r0) goto L7e
            r13.suppressed = r4
            r13.cleanStreak = r4
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r4)
        L7e:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.session.impl.EmbodimentLinkQualityGate.onMediaStats(java.util.List, long):java.lang.Boolean");
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LinkGrade.values().length];
            try {
                AnonymousClass002.A13(LinkGrade.POOR, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(LinkGrade.CLEAN, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(LinkGrade.FAIR, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(LinkGrade.STALLED, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(LinkGrade.UNKNOWN, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final int getSuppressionCount() {
        return this.suppressionCount;
    }

    public /* synthetic */ EmbodimentLinkQualityGate(int i, int i2, C06H c06h) {
        this((i2 & 1) != 0 ? 2 : i);
    }

    public EmbodimentLinkQualityGate(int i) {
        this.maxSuppressions = i;
    }
}
