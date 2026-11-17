package com.facebook.aura.analytics.hatch;

import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BPc;
import X.BRg;
import X.C7384Etj;
import X.EnumC10573Huf;
import X.G0U;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchImpressionModifierKt {
    public static final Set<String> loggedImpressionKeys;
    public static final ConcurrentHashMap<String, String> sessionImpressionIds;

    /* renamed from: com.facebook.aura.analytics.hatch.HatchImpressionModifierKt$hatchImpression$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U {
        public final /* synthetic */ Integer $absolutePosition;
        public final /* synthetic */ HatchComponent $component;
        public final /* synthetic */ String $componentId;
        public final /* synthetic */ String $dedupeKey;
        public final /* synthetic */ Map<String, String> $metadata;
        public final /* synthetic */ long $minDurationMs;
        public final /* synthetic */ Function0<Unit> $onImpression;
        public final /* synthetic */ HatchOrigin $origin;
        public final /* synthetic */ HatchScreen $screen;
        public final /* synthetic */ String $sessionDedupeKey;
        public final /* synthetic */ HatchSubsurface $subsurface;
        public final /* synthetic */ HatchSurface $surface;

        /* renamed from: com.facebook.aura.analytics.hatch.HatchImpressionModifierKt$hatchImpression$1$1, reason: invalid class name and collision with other inner class name */
        public final class C00301 extends AbstractC7559F3s implements Function0<Unit> {
            public static final C00301 INSTANCE = new C00301();

            public C00301() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x001f  */
        @Override // X.G0U
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final X.BL5 invoke(X.C2BR r16) {
            /*
                r15 = this;
                r2 = 0
                r0 = r16
                X.C7384Etj.A0Y(r0, r2)
                r3 = r15
                java.lang.String r0 = r15.$sessionDedupeKey
                if (r0 == 0) goto L65
                com.facebook.aura.analytics.hatch.HatchSessionId r0 = com.facebook.aura.analytics.hatch.HatchSessionId.INSTANCE
                java.lang.String r4 = r0.get()
                java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r1 = com.facebook.aura.analytics.hatch.HatchImpressionModifierKt.sessionImpressionIds
                java.lang.String r0 = r15.$sessionDedupeKey
                java.lang.Object r0 = r1.put(r0, r4)
                boolean r0 = X.C7384Etj.areEqual(r0, r4)
                if (r0 != 0) goto L5a
            L1f:
                com.facebook.aura.analytics.hatch.HatchImpressionLogger r8 = com.facebook.aura.analytics.hatch.HatchImpressionLogger.INSTANCE
                com.facebook.aura.analytics.hatch.HatchOrigin r9 = r15.$origin
                com.facebook.aura.analytics.hatch.HatchSurface r10 = r15.$surface
                com.facebook.aura.analytics.hatch.HatchSubsurface r11 = r15.$subsurface
                com.facebook.aura.analytics.hatch.HatchScreen r12 = r15.$screen
                com.facebook.aura.analytics.hatch.HatchComponent r13 = r15.$component
                java.lang.String r14 = r15.$componentId
                java.util.Map<java.lang.String, java.lang.String> r7 = r15.$metadata
                if (r7 != 0) goto L35
                X.9jH r7 = X.AGH.A0E()
            L35:
                com.facebook.aura.analytics.hatch.HatchMetadataKey r0 = com.facebook.aura.analytics.hatch.HatchMetadataKey.ENTER_TS
                java.lang.String r6 = r0.getValue()
                long r0 = r15.$minDurationMs
                java.util.Set<java.lang.String> r4 = com.facebook.aura.analytics.hatch.HatchImpressionModifierKt.loggedImpressionKeys
                long r4 = java.lang.System.currentTimeMillis()
                long r4 = r4 - r0
                java.lang.String r0 = java.lang.String.valueOf(r4)
                java.util.Map r15 = X.AnonymousClass006.A11(r6, r0, r7)
                java.lang.Integer r0 = r3.$absolutePosition
                r16 = r0
                r8.logImpression(r9, r10, r11, r12, r13, r14, r15, r16)
                kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r3.$onImpression
                if (r0 == 0) goto L5a
                r0.invoke()
            L5a:
                com.facebook.aura.analytics.hatch.HatchImpressionModifierKt$hatchImpression$1$1 r1 = com.facebook.aura.analytics.hatch.HatchImpressionModifierKt.AnonymousClass1.C00301.INSTANCE
                X.C7384Etj.A0Y(r1, r2)
                X.BL5 r0 = new X.BL5
                r0.<init>(r1)
                return r0
            L65:
                java.lang.String r1 = r15.$dedupeKey
                if (r1 == 0) goto L1f
                java.util.Set<java.lang.String> r0 = com.facebook.aura.analytics.hatch.HatchImpressionModifierKt.loggedImpressionKeys
                boolean r0 = r0.add(r1)
                if (r0 == 0) goto L5a
                goto L1f
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.analytics.hatch.HatchImpressionModifierKt.AnonymousClass1.invoke(X.2BR):X.BL5");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, String str2, HatchOrigin hatchOrigin, HatchSurface hatchSurface, HatchSubsurface hatchSubsurface, HatchScreen hatchScreen, HatchComponent hatchComponent, String str3, Map<String, String> map, long j, Integer num, Function0<Unit> function0) {
            super(1);
            this.$sessionDedupeKey = str;
            this.$dedupeKey = str2;
            this.$origin = hatchOrigin;
            this.$surface = hatchSurface;
            this.$subsurface = hatchSubsurface;
            this.$screen = hatchScreen;
            this.$component = hatchComponent;
            this.$componentId = str3;
            this.$metadata = map;
            this.$minDurationMs = j;
            this.$absolutePosition = num;
            this.$onImpression = function0;
        }
    }

    public static final BRg hatchImpression(BRg bRg, HatchOrigin hatchOrigin, HatchSurface hatchSurface, HatchSubsurface hatchSubsurface, HatchScreen hatchScreen, HatchComponent hatchComponent, String str, Map<String, String> map, Integer num, long j, float f, String str2, String str3, Function0<Unit> function0) {
        AnonymousClass003.A0u(bRg, hatchOrigin);
        return BPc.A00(bRg, EnumC10573Huf.A06, new AnonymousClass1(str3, str2, hatchOrigin, hatchSurface, hatchSubsurface, hatchScreen, hatchComponent, str, map, j, num, function0), f, j);
    }

    public static final BRg hatchSettingsImpression(BRg bRg, HatchScreen hatchScreen, HatchSubsurface hatchSubsurface) {
        AnonymousClass005.A0x(bRg, hatchScreen, hatchSubsurface);
        return hatchImpression(bRg, HatchOrigin.SETTINGS, HatchSurface.SETTINGS, hatchSubsurface, hatchScreen, null, null, null, null, 500L, 0.0f, null, null, null);
    }

    public static /* synthetic */ BRg hatchImpression$default(BRg bRg, HatchOrigin hatchOrigin, HatchSurface hatchSurface, HatchSubsurface hatchSubsurface, HatchScreen hatchScreen, HatchComponent hatchComponent, String str, Map map, Integer num, long j, float f, String str2, String str3, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            hatchSurface = null;
        }
        if ((i & 4) != 0) {
            hatchSubsurface = null;
        }
        if ((i & 8) != 0) {
            hatchScreen = null;
        }
        if ((i & 16) != 0) {
            hatchComponent = null;
        }
        if ((i & 32) != 0) {
            str = null;
        }
        if ((i & 64) != 0) {
            map = null;
        }
        if ((i & 128) != 0) {
            num = null;
        }
        if ((i & 256) != 0) {
            j = 500;
        }
        if ((i & 512) != 0) {
            f = 0.0f;
        }
        if ((i & 1024) != 0) {
            str2 = null;
        }
        if ((i & 2048) != 0) {
            str3 = null;
        }
        if ((i & 4096) != 0) {
            function0 = null;
        }
        return hatchImpression(bRg, hatchOrigin, hatchSurface, hatchSubsurface, hatchScreen, hatchComponent, str, map, num, j, f, str2, str3, function0);
    }

    public static /* synthetic */ BRg hatchSettingsImpression$default(BRg bRg, HatchScreen hatchScreen, HatchSubsurface hatchSubsurface, int i, Object obj) {
        if ((i & 2) != 0) {
            hatchSubsurface = HatchSubsurface.TAB_SETTINGS;
        }
        return hatchSettingsImpression(bRg, hatchScreen, hatchSubsurface);
    }

    static {
        ConcurrentHashMap.KeySetView keySetViewNewKeySet = ConcurrentHashMap.newKeySet();
        C7384Etj.A0U(keySetViewNewKeySet);
        loggedImpressionKeys = keySetViewNewKeySet;
        sessionImpressionIds = new ConcurrentHashMap<>();
    }

    public static final /* synthetic */ long access$viewportEntryTsMs(long j) {
        return System.currentTimeMillis() - j;
    }

    public static final long viewportEntryTsMs(long j) {
        return System.currentTimeMillis() - j;
    }
}
