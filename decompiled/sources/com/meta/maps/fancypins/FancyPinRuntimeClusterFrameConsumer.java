package com.meta.maps.fancypins;

import X.AnonymousClass003;
import X.C7384Etj;
import X.G0U;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes6.dex */
public interface FancyPinRuntimeClusterFrameConsumer extends AutoCloseable {
    boolean clearActiveVariant(String str);

    boolean clearRank(String str);

    boolean clearZOrder(String str);

    boolean onFrame(FancyPinRenderFrame fancyPinRenderFrame);

    FancyPin pin(String str);

    boolean setActiveVariant(String str, String str2);

    void setPinsChangedListener(G0U<? super List<FancyPin>, Unit> g0u);

    boolean setRank(String str, int i);

    boolean setZOrder(String str, float f);

    public abstract class DefaultImpls {
        @Deprecated
        public static boolean clearActiveVariant(FancyPinRuntimeClusterFrameConsumer fancyPinRuntimeClusterFrameConsumer, String str) {
            C7384Etj.A0Y(str, 1);
            return false;
        }

        @Deprecated
        public static boolean clearRank(FancyPinRuntimeClusterFrameConsumer fancyPinRuntimeClusterFrameConsumer, String str) {
            C7384Etj.A0Y(str, 1);
            return false;
        }

        @Deprecated
        public static boolean clearZOrder(FancyPinRuntimeClusterFrameConsumer fancyPinRuntimeClusterFrameConsumer, String str) {
            C7384Etj.A0Y(str, 1);
            return false;
        }

        @Deprecated
        public static FancyPin pin(FancyPinRuntimeClusterFrameConsumer fancyPinRuntimeClusterFrameConsumer, String str) {
            C7384Etj.A0Y(str, 1);
            return null;
        }

        @Deprecated
        public static boolean setRank(FancyPinRuntimeClusterFrameConsumer fancyPinRuntimeClusterFrameConsumer, String str, int i) {
            C7384Etj.A0Y(str, 1);
            return false;
        }

        @Deprecated
        public static boolean setZOrder(FancyPinRuntimeClusterFrameConsumer fancyPinRuntimeClusterFrameConsumer, String str, float f) {
            C7384Etj.A0Y(str, 1);
            return false;
        }

        @Deprecated
        public static boolean setActiveVariant(FancyPinRuntimeClusterFrameConsumer fancyPinRuntimeClusterFrameConsumer, String str, String str2) {
            AnonymousClass003.A0x(str, str2);
            return false;
        }

        @Deprecated
        public static void setPinsChangedListener(FancyPinRuntimeClusterFrameConsumer fancyPinRuntimeClusterFrameConsumer, G0U<? super List<FancyPin>, Unit> g0u) {
        }
    }

    /* renamed from: com.meta.maps.fancypins.FancyPinRuntimeClusterFrameConsumer$-CC, reason: invalid class name */
    public abstract /* synthetic */ class CC {
        public static boolean $default$clearActiveVariant(FancyPinRuntimeClusterFrameConsumer fancyPinRuntimeClusterFrameConsumer, String str) {
            return false;
        }

        public static boolean $default$clearRank(FancyPinRuntimeClusterFrameConsumer fancyPinRuntimeClusterFrameConsumer, String str) {
            return false;
        }

        public static boolean $default$clearZOrder(FancyPinRuntimeClusterFrameConsumer fancyPinRuntimeClusterFrameConsumer, String str) {
            return false;
        }

        public static FancyPin $default$pin(FancyPinRuntimeClusterFrameConsumer fancyPinRuntimeClusterFrameConsumer, String str) {
            return null;
        }

        public static void $default$setPinsChangedListener(FancyPinRuntimeClusterFrameConsumer fancyPinRuntimeClusterFrameConsumer, G0U g0u) {
        }

        public static /* synthetic */ boolean access$clearActiveVariant$jd(FancyPinRuntimeClusterFrameConsumer fancyPinRuntimeClusterFrameConsumer, String str) {
            return false;
        }

        public static /* synthetic */ boolean access$clearRank$jd(FancyPinRuntimeClusterFrameConsumer fancyPinRuntimeClusterFrameConsumer, String str) {
            return false;
        }

        public static /* synthetic */ boolean access$clearZOrder$jd(FancyPinRuntimeClusterFrameConsumer fancyPinRuntimeClusterFrameConsumer, String str) {
            return false;
        }

        public static /* synthetic */ FancyPin access$pin$jd(FancyPinRuntimeClusterFrameConsumer fancyPinRuntimeClusterFrameConsumer, String str) {
            return null;
        }

        public static /* synthetic */ void access$setPinsChangedListener$jd(FancyPinRuntimeClusterFrameConsumer fancyPinRuntimeClusterFrameConsumer, G0U g0u) {
        }

        public static boolean $default$setActiveVariant(FancyPinRuntimeClusterFrameConsumer fancyPinRuntimeClusterFrameConsumer, String str, String str2) {
            return false;
        }

        public static boolean $default$setRank(FancyPinRuntimeClusterFrameConsumer fancyPinRuntimeClusterFrameConsumer, String str, int i) {
            return false;
        }

        public static boolean $default$setZOrder(FancyPinRuntimeClusterFrameConsumer fancyPinRuntimeClusterFrameConsumer, String str, float f) {
            return false;
        }

        public static /* synthetic */ boolean access$setActiveVariant$jd(FancyPinRuntimeClusterFrameConsumer fancyPinRuntimeClusterFrameConsumer, String str, String str2) {
            return false;
        }

        public static /* synthetic */ boolean access$setRank$jd(FancyPinRuntimeClusterFrameConsumer fancyPinRuntimeClusterFrameConsumer, String str, int i) {
            return false;
        }

        public static /* synthetic */ boolean access$setZOrder$jd(FancyPinRuntimeClusterFrameConsumer fancyPinRuntimeClusterFrameConsumer, String str, float f) {
            return false;
        }
    }
}
