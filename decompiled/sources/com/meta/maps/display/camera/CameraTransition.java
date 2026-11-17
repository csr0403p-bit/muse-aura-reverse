package com.meta.maps.display.camera;

import X.C06H;
import X.Ey9;
import X.F3w;
import com.meta.maps.NativeBase;
import com.meta.maps.display.AnimationTween;

/* loaded from: classes4.dex */
public final class CameraTransition extends NativeBase {
    public static final Companion Companion = new Companion();
    public final Kind kind;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes.dex */
    public final class Kind {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ Kind[] $VALUES;
        public static final Kind INSTANT;
        public static final Kind TWEEN;
        public final int value;

        static {
            Kind kind = new Kind("INSTANT", 0, 0);
            INSTANT = kind;
            Kind kind2 = new Kind("TWEEN", 1, 1);
            TWEEN = kind2;
            Kind[] kindArr = {kind, kind2};
            $VALUES = kindArr;
            $ENTRIES = new F3w(kindArr);
        }

        public static Ey9<Kind> getEntries() {
            return $ENTRIES;
        }

        public static Kind valueOf(String str) {
            return (Kind) Enum.valueOf(Kind.class, str);
        }

        public static Kind[] values() {
            return (Kind[]) $VALUES.clone();
        }

        public Kind(String str, int i, int i2) {
            this.value = i2;
        }
    }

    public static final native void disposeNativeHandle(long j);

    public static final native CameraTransition instant();

    public static final native CameraTransition tween(AnimationTween animationTween);

    public final native Kind getKind();

    public final native AnimationTween tweenSpec();

    public final class Companion implements NativeBase.Disposer {
        public final CameraTransition instant() {
            return CameraTransition.instant();
        }

        public final CameraTransition tween(AnimationTween animationTween) {
            return CameraTransition.tween(animationTween);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        private final void disposeNativeHandle(long j) {
            CameraTransition.disposeNativeHandle(j);
        }

        @Override // com.meta.maps.NativeBase.Disposer
        public void dispose(long j) {
            CameraTransition.disposeNativeHandle(j);
        }

        public Companion() {
        }
    }

    public CameraTransition(long j, Object obj) {
        super(j, Companion);
    }
}
