package com.facebook.aura.navigation.key;

import X.AbstractC5321DgF;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cG;
import X.C60N;
import X.C7384Etj;
import X.C79;
import X.C9dz;
import X.C9hq;
import X.C9hr;
import X.C9iI;
import X.C9uG;
import X.F0C;
import X.F60;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public interface AuraSubscriptionPage {
    public static final Companion Companion = Companion.$$INSTANCE;

    @Serializable
    public final class BuyCredits extends C06G implements AuraSubscriptionPage {
        public static final Companion Companion = new Companion();
        public final String prevSurface;

        public final class Companion {
            public final C9hr<BuyCredits> serializer() {
                return AuraSubscriptionPage$BuyCredits$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(C06H c06h) {
            }

            public Companion() {
            }
        }

        public final BuyCredits copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new BuyCredits(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof BuyCredits) && C7384Etj.areEqual(this.prevSurface, ((BuyCredits) obj).prevSurface));
        }

        public /* synthetic */ BuyCredits(int i, String str, C2hx c2hx) {
            if (1 != (i & 1)) {
                C9iI.A00(AuraSubscriptionPage$BuyCredits$$serializer.descriptor, i, 1);
                throw F60.createAndThrow();
            }
            this.prevSurface = str;
        }

        public static /* synthetic */ BuyCredits copy$default(BuyCredits buyCredits, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = buyCredits.prevSurface;
            }
            C7384Etj.A0Y(str, 0);
            return new BuyCredits(str);
        }

        public final String component1() {
            return this.prevSurface;
        }

        public final String getPrevSurface() {
            return this.prevSurface;
        }

        public int hashCode() {
            return this.prevSurface.hashCode();
        }

        public String toString() {
            return super.toString();
        }

        public BuyCredits(String str) {
            C7384Etj.A0Y(str, 0);
            this.prevSurface = str;
        }
    }

    public final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        public final C9hr<AuraSubscriptionPage> serializer() {
            return new C9hq("com.facebook.aura.navigation.key.AuraSubscriptionPage", C3cG.A0x(AuraSubscriptionPage.class), new Annotation[0], new C9uG[]{C3cG.A0x(BuyCredits.class), C3cG.A0x(ConfirmName.class), C3cG.A0x(Paywall.class), C3cG.A0x(Usage.class)}, new C9hr[]{AuraSubscriptionPage$BuyCredits$$serializer.INSTANCE, new C9dz(ConfirmName.INSTANCE, "com.facebook.aura.navigation.key.AuraSubscriptionPage.ConfirmName", new Annotation[0]), new C9dz(Paywall.INSTANCE, "com.facebook.aura.navigation.key.AuraSubscriptionPage.Paywall", new Annotation[0]), new C9dz(Usage.INSTANCE, C60N.A00(74), new Annotation[0])});
        }
    }

    @Serializable
    /* loaded from: classes.dex */
    public final class ConfirmName implements AuraSubscriptionPage {
        public static final ConfirmName INSTANCE = new ConfirmName();
        public static final /* synthetic */ F0C<C9hr<Object>> $cachedSerializer$delegate = AbstractC5321DgF.A02(C79.A01, AnonymousClass1.INSTANCE);

        /* renamed from: com.facebook.aura.navigation.key.AuraSubscriptionPage$ConfirmName$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<C9hr<Object>> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final C9hr<Object> invoke() {
                return new C9dz(ConfirmName.INSTANCE, "com.facebook.aura.navigation.key.AuraSubscriptionPage.ConfirmName", new Annotation[0]);
            }
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ConfirmName);
        }

        private final /* synthetic */ C9hr get$cachedSerializer() {
            return AnonymousClass001.A12($cachedSerializer$delegate);
        }

        public final C9hr<ConfirmName> serializer() {
            return AnonymousClass001.A12($cachedSerializer$delegate);
        }

        public String toString() {
            return "ConfirmName";
        }

        public int hashCode() {
            return -565902331;
        }
    }

    @Serializable
    /* loaded from: classes.dex */
    public final class Paywall implements AuraSubscriptionPage {
        public static final Paywall INSTANCE = new Paywall();
        public static final /* synthetic */ F0C<C9hr<Object>> $cachedSerializer$delegate = AbstractC5321DgF.A02(C79.A01, AnonymousClass1.INSTANCE);

        /* renamed from: com.facebook.aura.navigation.key.AuraSubscriptionPage$Paywall$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<C9hr<Object>> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final C9hr<Object> invoke() {
                return new C9dz(Paywall.INSTANCE, "com.facebook.aura.navigation.key.AuraSubscriptionPage.Paywall", new Annotation[0]);
            }
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Paywall);
        }

        private final /* synthetic */ C9hr get$cachedSerializer() {
            return AnonymousClass001.A12($cachedSerializer$delegate);
        }

        public final C9hr<Paywall> serializer() {
            return AnonymousClass001.A12($cachedSerializer$delegate);
        }

        public String toString() {
            return "Paywall";
        }

        public int hashCode() {
            return 1951701516;
        }
    }

    @Serializable
    /* loaded from: classes3.dex */
    public final class Usage implements AuraSubscriptionPage {
        public static final Usage INSTANCE = new Usage();
        public static final /* synthetic */ F0C<C9hr<Object>> $cachedSerializer$delegate = AbstractC5321DgF.A02(C79.A01, AnonymousClass1.INSTANCE);

        /* renamed from: com.facebook.aura.navigation.key.AuraSubscriptionPage$Usage$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<C9hr<Object>> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final C9hr<Object> invoke() {
                return new C9dz(Usage.INSTANCE, "com.facebook.aura.navigation.key.AuraSubscriptionPage.Usage", new Annotation[0]);
            }
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Usage);
        }

        private final /* synthetic */ C9hr get$cachedSerializer() {
            return AnonymousClass001.A12($cachedSerializer$delegate);
        }

        public final C9hr<Usage> serializer() {
            return AnonymousClass001.A12($cachedSerializer$delegate);
        }

        public String toString() {
            return "Usage";
        }

        public int hashCode() {
            return 355764155;
        }
    }
}
