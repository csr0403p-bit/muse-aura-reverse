package com.meta.maps.display;

import X.AnonymousClass005;
import X.C60Q;
import X.C6xC;
import com.meta.maps.time.Duration;

/* loaded from: classes4.dex */
public final class AnimationTween {
    public Duration duration = Duration.Companion.ofMillis(300);
    public EasingType easing = EasingType.EASE_IN_OUT;

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof AnimationTween) {
                AnimationTween animationTween = (AnimationTween) obj;
                if (!C6xC.A00(this.duration, animationTween.duration) || !C6xC.A00(this.easing, animationTween.easing)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.easing, C60Q.A02(this.duration) * 31);
    }
}
