package com.facebook.aura.feed.view;

import X.AKQ;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C05663ul;
import X.C06G;
import X.C06I;
import X.C0dx;
import X.C0v5;
import X.C10G;
import X.C1515AkP;
import X.C1BO;
import X.C1YD;
import X.C20Q;
import X.C2CK;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.C9m9;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import android.content.Context;
import android.icu.text.DateFormat;
import android.icu.text.MeasureFormat;
import android.icu.util.Measure;
import android.icu.util.MeasureUnit;
import android.icu.util.TimeUnit;
import com.facebook.aura.R;
import com.facebook.aura.feed.repo.FeedPostMetadata;
import com.facebook.aura.feed.repo.FeedPostMetadataDetail;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class FeedPostInformationKt {

    /* renamed from: com.facebook.aura.feed.view.FeedPostInformationKt$FeedMetadataText$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$text = str;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            FeedPostInformationKt.FeedMetadataText(this.$text, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.feed.view.FeedPostInformationKt$FeedPostInformationButton$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $expanded;
        public final /* synthetic */ FeedPostMetadata $metadata;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(FeedPostMetadata feedPostMetadata, boolean z, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$metadata = feedPostMetadata;
            this.$expanded = z;
            this.$onClick = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            FeedPostInformationKt.FeedPostInformationButton(this.$metadata, this.$expanded, this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.feed.view.FeedPostInformationKt$FeedPostMetadataContent$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ FeedPostMetadata $metadata;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(FeedPostMetadata feedPostMetadata, BRg bRg, int i, int i2) {
            super(2);
            this.$metadata = feedPostMetadata;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            FeedPostInformationKt.FeedPostMetadataContent(this.$metadata, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void FeedMetadataText(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1151288315);
        int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, str) : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraTextKt.m2639AuraTextUY9GdpU(str, AnonymousClass001.A0R(bRg2), C06G.A08(bfm), C06G.A0Z(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16368);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(str, bRg2, i, i2);
        }
    }

    public static final void FeedPostInformationButton(FeedPostMetadata feedPostMetadata, boolean z, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        String strA0t;
        int i3;
        BRg bRg2 = bRg;
        AnonymousClass002.A1A(feedPostMetadata, 0, function0);
        bfm.AgG(-1368580587);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, feedPostMetadata) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function0);
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0d), bfm, iA0d)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            Locale localeA0b = AnonymousClass007.A0b(bfm);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = new C05663ul(new FeedPostInformationKt$FeedPostInformationButton$clock$1$1(null));
                bfm.Ai0(objAaT);
            }
            C1BO c1boA01 = C2CK.A01(bfm, null, Long.valueOf(System.currentTimeMillis()), (C20Q) objAaT, 0, 14);
            Long l = feedPostMetadata.generatedAtMs;
            if (l == null) {
                bfm.AgE(740790724);
                strA0t = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12027f);
            } else {
                bfm.AgE(740874083);
                String str = DateFormat.getDateTimeInstance(0, 3, localeA0b).format(new Date(l.longValue()));
                C7384Etj.A0U(str);
                strA0t = AnonymousClass001.A0t(bfm, str, R.string._name_removed__res_0x7f120280);
            }
            BBI bbi = (BBI) bfm;
            BBI.A0R(bbi, false);
            int i5 = R.string._name_removed__res_0x7f120277;
            if (z) {
                i5 = R.string._name_removed__res_0x7f120278;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, i5);
            C0dx c0dxA0T = AnonymousClass002.A0T(bfm);
            C1YD c1yd = new C1YD(0);
            boolean zA1K = AnonymousClass004.A1K(iA0d) | bfm.A67(c0dxA0T);
            Object objAaT2 = bfm.AaT();
            if (zA1K || objAaT2 == obj) {
                objAaT2 = new FeedPostInformationKt$FeedPostInformationButton$1$1(c0dxA0T, function0);
                bfm.Ai0(objAaT2);
            }
            BRg bRgA04 = C0v5.A04(bRg2, c1yd, null, (Function0) objAaT2, true);
            boolean zA1K2 = AnonymousClass003.A1K(bfm, strA0t, strA01);
            Object objAaT3 = bfm.AaT();
            if (zA1K2 || objAaT3 == obj) {
                objAaT3 = new FeedPostInformationKt$FeedPostInformationButton$2$1(strA0t, strA01);
                bfm.Ai0(objAaT3);
            }
            BRg bRgA0B = C3U4.A0B(C10G.A0F(AnonymousClass001.A0Y(bRgA04, objAaT3, true), 48.0f, 48.0f, Float.NaN, Float.NaN), 10.0f, 16.0f);
            InterfaceC1380AiA interfaceC1380AiAA0L = AnonymousClass007.A0L(bfm, 6.0f);
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0L, akqA04, bRgA01, iA0J);
            if (z || l == null) {
                bfm.AgE(-1829321359);
                BBI.A0R(bbi, false);
                i3 = R.drawable.circle_info_wght400_filled_20;
                if (!z) {
                }
                AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, i3, 0), AuraIconSize.X_SMALL, null, C06G.A0C(bfm), null, bfm, AnonymousClass001.A04(), 33);
                BBI.A0R(bbi, true);
            } else {
                bfm.AgE(-1829507979);
                long jLongValue = l.longValue();
                long jFeedPostInformationButton$lambda$1 = FeedPostInformationButton$lambda$1(c1boA01);
                C7384Etj.A0X(localeA0b);
                AuraTextKt.m2639AuraTextUY9GdpU(compactFeedPostAge(jLongValue, jFeedPostInformationButton$lambda$1, localeA0b), null, C06G.A09(bfm), C06G.A0Z(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
                BBI.A0R(bbi, false);
            }
            i3 = R.drawable.circle_info_wght400_outline_20;
            AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, i3, 0), AuraIconSize.X_SMALL, null, C06G.A0C(bfm), null, bfm, AnonymousClass001.A04(), 33);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(feedPostMetadata, z, function0, bRg2, i, i2);
        }
    }

    public static final void FeedPostMetadataContent(FeedPostMetadata feedPostMetadata, BRg bRg, BFM bfm, int i, int i2) {
        String strA0l;
        BRg bRgA0Q = bRg;
        C7384Etj.A0Y(feedPostMetadata, 0);
        bfm.AgG(818689953);
        int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, feedPostMetadata) : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRgA0Q);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRgA0Q = BRg.A00;
            }
            Locale localeA0b = AnonymousClass007.A0b(bfm);
            Context contextA0H = AnonymousClass002.A0H(bfm);
            C9m9 c9m9A00 = AcQ.A00(8.0f);
            C3TH c3th = C2VU.A02;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(c9m9A00, bfm, c3th, 6);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i4 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0Q);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA00, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i4);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            String str = feedPostMetadata.explanation;
            if (str == null || (strA0l = AnonymousClass002.A0l(str)) == null || strA0l.length() <= 0) {
                bfm.AgE(1828270401);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(1828270402);
                FeedMetadataText(strA0l, null, bfm, 0, 2);
                BBI.A0R(bbi, false);
            }
            Long l = feedPostMetadata.generatedAtMs;
            if (l == null) {
                bfm.AgE(1828362192);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(1828362193);
                Date date = new Date(l.longValue());
                String str2 = DateFormat.getInstanceForSkeleton("EEEE", localeA0b).format(date);
                C7384Etj.A0U(str2);
                String str3 = android.text.format.DateFormat.getTimeFormat(contextA0H).format(date);
                C7384Etj.A0U(str3);
                FeedMetadataText(AnonymousClass006.A0w(bfm, str2, str3, R.string._name_removed__res_0x7f120281), null, bfm, 0, 2);
                BBI.A0R(bbi, false);
            }
            bfm.AgE(-495196788);
            for (FeedPostMetadataDetail feedPostMetadataDetail : feedPostMetadata.details) {
                C9m9 c9m9A002 = AcQ.A00(4.0f);
                BS0 bs0 = BRg.A00;
                InterfaceC1380AiA interfaceC1380AiAA002 = C06I.A00(c9m9A002, bfm, c3th, 6);
                int iA0D = AnonymousClass001.A0D(bbi);
                AKQ akqA042 = BBI.A04(bbi);
                BRg bRgA012 = AxM.A01(bfm, bs0);
                AnonymousClass005.A0n(bfm, bbi, function0);
                BPg.A02(bfm, interfaceC1380AiAA002, g0v);
                BPg.A02(bfm, akqA042, g0v2);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
                BPg.A02(bfm, bRgA012, g0vA0u);
                AuraTextKt.m2639AuraTextUY9GdpU(feedPostMetadataDetail.title, null, C06G.A08(bfm), AnonymousClass002.A0f(bfm).subheadlineEmphasized, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
                FeedMetadataText(feedPostMetadataDetail.value, null, bfm, 0, 2);
                BBI.A0R(bbi, true);
            }
            bRgA0Q = AnonymousClass001.A0Q(bbi, bRgA0Q, false, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(feedPostMetadata, bRgA0Q, i, i2);
        }
    }

    public static final String compactFeedPostAge(long j, long j2, Locale locale) {
        String measures;
        Long lValueOf;
        TimeUnit timeUnit;
        long j3 = j2 - j;
        if (j3 >= 0) {
            if (j3 >= 3600000) {
                if (j3 < 86400000) {
                    lValueOf = Long.valueOf(j3 / 3600000);
                    timeUnit = MeasureUnit.HOUR;
                } else {
                    if (j3 >= 604800000) {
                        Calendar calendar = Calendar.getInstance();
                        calendar.setTimeInMillis(j);
                        int i = calendar.get(1);
                        Calendar calendar2 = Calendar.getInstance();
                        calendar2.setTimeInMillis(j2);
                        measures = DateFormat.getInstanceForSkeleton(i == calendar2.get(1) ? "MMMd" : "yMMMd", locale).format(new Date(j));
                        C7384Etj.A0U(measures);
                        return measures;
                    }
                    lValueOf = Long.valueOf(j3 / 86400000);
                    timeUnit = MeasureUnit.DAY;
                }
            }
            measures = MeasureFormat.getInstance(locale, MeasureFormat.FormatWidth.SHORT).formatMeasures(new Measure(lValueOf, timeUnit));
            C7384Etj.A0U(measures);
            return measures;
        }
        j3 = 0;
        long j4 = j3 / 60000;
        if (j4 < 1) {
            j4 = 1;
        }
        lValueOf = Long.valueOf(j4);
        timeUnit = MeasureUnit.MINUTE;
        measures = MeasureFormat.getInstance(locale, MeasureFormat.FormatWidth.SHORT).formatMeasures(new Measure(lValueOf, timeUnit));
        C7384Etj.A0U(measures);
        return measures;
    }

    public static final long FeedPostInformationButton$lambda$1(C1BO<Long> c1bo) {
        return c1bo.getValue().longValue();
    }
}
