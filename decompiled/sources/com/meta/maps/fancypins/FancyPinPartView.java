package com.meta.maps.fancypins;

import X.C8j3;
import com.meta.maps.fancypins.FancyPinPartConfiguration;

/* loaded from: classes6.dex */
public interface FancyPinPartView<Configuration extends FancyPinPartConfiguration> {

    /* renamed from: com.meta.maps.fancypins.FancyPinPartView$-CC, reason: invalid class name */
    public abstract /* synthetic */ class CC {
        public static void $default$prepareForReuse(FancyPinPartView fancyPinPartView) {
        }

        public static /* synthetic */ void access$prepareForReuse$jd(FancyPinPartView fancyPinPartView) {
        }

        public static /* synthetic */ void apply$default(FancyPinPartView fancyPinPartView, FancyPinPartConfiguration fancyPinPartConfiguration, FancyPinPartConfiguration fancyPinPartConfiguration2, FancyPinPartState fancyPinPartState, FancyPinPartAnimationHint fancyPinPartAnimationHint, FancyPinPartApplyCompletion fancyPinPartApplyCompletion, int i, Object obj) {
            if (obj != null) {
                throw C8j3.A18("Super calls with default arguments not supported in this target, function: apply");
            }
            if ((i & 16) != 0) {
                fancyPinPartApplyCompletion = null;
            }
            fancyPinPartView.apply(fancyPinPartConfiguration, fancyPinPartConfiguration2, fancyPinPartState, fancyPinPartAnimationHint, fancyPinPartApplyCompletion);
        }

        public static boolean $default$containsTapPoint(FancyPinPartView fancyPinPartView, float f, float f2) {
            return true;
        }

        public static /* synthetic */ boolean access$containsTapPoint$jd(FancyPinPartView fancyPinPartView, float f, float f2) {
            return true;
        }
    }

    public abstract class DefaultImpls {
        @Deprecated
        public static <Configuration extends FancyPinPartConfiguration> void prepareForReuse(FancyPinPartView<Configuration> fancyPinPartView) {
        }

        @Deprecated
        public static <Configuration extends FancyPinPartConfiguration> boolean containsTapPoint(FancyPinPartView<Configuration> fancyPinPartView, float f, float f2) {
            return true;
        }
    }

    void apply(Configuration configuration, Configuration configuration2, FancyPinPartState fancyPinPartState, FancyPinPartAnimationHint fancyPinPartAnimationHint, FancyPinPartApplyCompletion fancyPinPartApplyCompletion);

    boolean containsTapPoint(float f, float f2);

    void prepareForReuse();
}
