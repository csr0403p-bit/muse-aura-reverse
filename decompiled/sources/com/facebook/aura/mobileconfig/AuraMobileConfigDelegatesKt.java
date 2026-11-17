package com.facebook.aura.mobileconfig;

import X.AnonymousClass003;
import X.C31u;
import X.C4992DKo;
import X.C7384Etj;
import X.C7491Exw;
import X.F23;
import X.InterfaceC7359EnW;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public abstract class AuraMobileConfigDelegatesKt {

    /* renamed from: com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt$auraMobileConfigBooleanWithOptions$1, reason: invalid class name and case insensitive filesystem */
    public final class C126951<T, V> implements C31u {
        public final /* synthetic */ C4992DKo $options;
        public final /* synthetic */ C7491Exw<Boolean, ?> $spec;

        public C126951(C7491Exw<Boolean, ?> c7491Exw, C4992DKo c4992DKo) {
            this.$spec = c7491Exw;
            this.$options = c4992DKo;
        }

        @Override // X.C31u
        public final Boolean getValue(Object obj, InterfaceC7359EnW<?> interfaceC7359EnW) {
            return Boolean.valueOf(AuraMobileConfig.INSTANCE.getBooleanWithOptions$fbandroid_express_aura_java_com_facebook_aura_mobileconfig_mobileconfig(this.$spec, this.$options));
        }

        @Override // X.C31u
        public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC7359EnW interfaceC7359EnW) {
            return getValue(obj, (InterfaceC7359EnW<?>) interfaceC7359EnW);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt$auraMobileConfigVar$1, reason: invalid class name and case insensitive filesystem */
    public final class C127031<T> implements F23<Object, T> {
        public final /* synthetic */ Function0<T> $compute;

        /* JADX WARN: Multi-variable type inference failed */
        public C127031(Function0<? extends T> function0) {
            this.$compute = function0;
        }

        @Override // X.C31u
        public T getValue(Object obj, InterfaceC7359EnW<?> interfaceC7359EnW) {
            return this.$compute.invoke();
        }

        public void setValue(Object obj, InterfaceC7359EnW<?> interfaceC7359EnW, T t) {
        }
    }

    public static final <T> C31u<Object, T> auraMobileConfig(final Function0<? extends T> function0) {
        C7384Etj.A0Y(function0, 0);
        return new C31u() { // from class: com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt.auraMobileConfig.1
            @Override // X.C31u
            public final T getValue(Object obj, InterfaceC7359EnW<?> interfaceC7359EnW) {
                return function0.invoke();
            }
        };
    }

    public static final C31u<Object, Boolean> auraMobileConfigBoolean(final C7491Exw<Boolean, ?> c7491Exw) {
        C7384Etj.A0Y(c7491Exw, 0);
        return new C31u() { // from class: com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt.auraMobileConfigBoolean.1
            @Override // X.C31u
            public final Boolean getValue(Object obj, InterfaceC7359EnW<?> interfaceC7359EnW) {
                return Boolean.valueOf(AuraMobileConfig.INSTANCE.getBoolean$fbandroid_express_aura_java_com_facebook_aura_mobileconfig_mobileconfig(c7491Exw));
            }

            @Override // X.C31u
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC7359EnW interfaceC7359EnW) {
                return getValue(obj, (InterfaceC7359EnW<?>) interfaceC7359EnW);
            }
        };
    }

    public static final C31u<Object, Double> auraMobileConfigDouble(final C7491Exw<Double, ?> c7491Exw) {
        C7384Etj.A0Y(c7491Exw, 0);
        return new C31u() { // from class: com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt.auraMobileConfigDouble.1
            @Override // X.C31u
            public final Double getValue(Object obj, InterfaceC7359EnW<?> interfaceC7359EnW) {
                return Double.valueOf(AuraMobileConfig.INSTANCE.getDouble$fbandroid_express_aura_java_com_facebook_aura_mobileconfig_mobileconfig(c7491Exw));
            }

            @Override // X.C31u
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC7359EnW interfaceC7359EnW) {
                return getValue(obj, (InterfaceC7359EnW<?>) interfaceC7359EnW);
            }
        };
    }

    public static final long auraMobileConfigFetchLongWithOptions(long j, C4992DKo c4992DKo) {
        C7384Etj.A0Y(c4992DKo, 1);
        return AuraMobileConfig.INSTANCE.getLongWithOptions$fbandroid_express_aura_java_com_facebook_aura_mobileconfig_mobileconfig(j, c4992DKo);
    }

    public static final C31u<Object, Integer> auraMobileConfigInt(final C7491Exw<Long, ?> c7491Exw) {
        C7384Etj.A0Y(c7491Exw, 0);
        return new C31u() { // from class: com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt.auraMobileConfigInt.1
            @Override // X.C31u
            public final Integer getValue(Object obj, InterfaceC7359EnW<?> interfaceC7359EnW) {
                return Integer.valueOf(AuraMobileConfig.INSTANCE.getInt$fbandroid_express_aura_java_com_facebook_aura_mobileconfig_mobileconfig(c7491Exw));
            }

            @Override // X.C31u
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC7359EnW interfaceC7359EnW) {
                return getValue(obj, (InterfaceC7359EnW<?>) interfaceC7359EnW);
            }
        };
    }

    public static final C31u<Object, Long> auraMobileConfigLong(final C7491Exw<Long, ?> c7491Exw) {
        C7384Etj.A0Y(c7491Exw, 0);
        return new C31u() { // from class: com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt.auraMobileConfigLong.1
            @Override // X.C31u
            public final Long getValue(Object obj, InterfaceC7359EnW<?> interfaceC7359EnW) {
                return Long.valueOf(AuraMobileConfig.INSTANCE.getLong$fbandroid_express_aura_java_com_facebook_aura_mobileconfig_mobileconfig(c7491Exw));
            }

            @Override // X.C31u
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC7359EnW interfaceC7359EnW) {
                return getValue(obj, (InterfaceC7359EnW<?>) interfaceC7359EnW);
            }
        };
    }

    public static final C31u<Object, String> auraMobileConfigString(final C7491Exw<String, ?> c7491Exw) {
        C7384Etj.A0Y(c7491Exw, 0);
        return new C31u() { // from class: com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt.auraMobileConfigString.1
            @Override // X.C31u
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC7359EnW interfaceC7359EnW) {
                return AuraMobileConfig.INSTANCE.getString$fbandroid_express_aura_java_com_facebook_aura_mobileconfig_mobileconfig(c7491Exw);
            }

            @Override // X.C31u
            public final String getValue(Object obj, InterfaceC7359EnW<?> interfaceC7359EnW) {
                return AuraMobileConfig.INSTANCE.getString$fbandroid_express_aura_java_com_facebook_aura_mobileconfig_mobileconfig(c7491Exw);
            }
        };
    }

    public static final <T> F23<Object, T> auraMobileConfigVar(Function0<? extends T> function0) {
        C7384Etj.A0Y(function0, 0);
        return new C127031(function0);
    }

    public static final C31u<Object, Boolean> auraMobileConfigBooleanWithOptions(C7491Exw<Boolean, ?> c7491Exw, C4992DKo c4992DKo) {
        AnonymousClass003.A0u(c7491Exw, c4992DKo);
        return new C126951(c7491Exw, c4992DKo);
    }

    public static final C31u<Object, Integer> auraMobileConfigIntWithOptions(final C7491Exw<Long, ?> c7491Exw, final C4992DKo c4992DKo) {
        AnonymousClass003.A0u(c7491Exw, c4992DKo);
        return new C31u() { // from class: com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt.auraMobileConfigIntWithOptions.1
            @Override // X.C31u
            public final Integer getValue(Object obj, InterfaceC7359EnW<?> interfaceC7359EnW) {
                return Integer.valueOf(AuraMobileConfig.INSTANCE.getIntWithOptions$fbandroid_express_aura_java_com_facebook_aura_mobileconfig_mobileconfig(c7491Exw, c4992DKo));
            }

            @Override // X.C31u
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC7359EnW interfaceC7359EnW) {
                return getValue(obj, (InterfaceC7359EnW<?>) interfaceC7359EnW);
            }
        };
    }

    public static final C31u<Object, Long> auraMobileConfigLongWithOptions(final C7491Exw<Long, ?> c7491Exw, final C4992DKo c4992DKo) {
        AnonymousClass003.A0u(c7491Exw, c4992DKo);
        return new C31u() { // from class: com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt.auraMobileConfigLongWithOptions.1
            @Override // X.C31u
            public final Long getValue(Object obj, InterfaceC7359EnW<?> interfaceC7359EnW) {
                return Long.valueOf(AuraMobileConfig.INSTANCE.getLongWithOptions$fbandroid_express_aura_java_com_facebook_aura_mobileconfig_mobileconfig(c7491Exw, c4992DKo));
            }

            @Override // X.C31u
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC7359EnW interfaceC7359EnW) {
                return getValue(obj, (InterfaceC7359EnW<?>) interfaceC7359EnW);
            }
        };
    }

    public static final C31u<Object, String> auraMobileConfigStringWithOptions(final C7491Exw<String, ?> c7491Exw, final C4992DKo c4992DKo) {
        AnonymousClass003.A0u(c7491Exw, c4992DKo);
        return new C31u() { // from class: com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt.auraMobileConfigStringWithOptions.1
            @Override // X.C31u
            public final String getValue(Object obj, InterfaceC7359EnW<?> interfaceC7359EnW) {
                return AuraMobileConfig.INSTANCE.getStringWithOptions$fbandroid_express_aura_java_com_facebook_aura_mobileconfig_mobileconfig(c7491Exw, c4992DKo);
            }

            @Override // X.C31u
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC7359EnW interfaceC7359EnW) {
                return getValue(obj, (InterfaceC7359EnW<?>) interfaceC7359EnW);
            }
        };
    }
}
