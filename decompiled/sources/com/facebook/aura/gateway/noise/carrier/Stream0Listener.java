package com.facebook.aura.gateway.noise.carrier;

import X.AnonymousClass003;
import X.C7384Etj;
import X.ET9;

/* loaded from: classes5.dex */
public interface Stream0Listener {
    void onClose(String str);

    void onCloseWithOutcome(ET9 et9, String str);

    void onCloseWithOutcomeNative(int i, String str);

    void onFailure(int i, String str);

    void onFailureDiagnostic(String str);

    void onMessage(byte[] bArr);

    void onPreconnectTiming(boolean z, long j, long j2, long j3);

    void onReady();

    void onReadyWithOutcome(ET9 et9);

    void onReadyWithOutcomeNative(int i);

    void onTransportReady();

    void onWebSocketUpgraded(String str);

    /* renamed from: com.facebook.aura.gateway.noise.carrier.Stream0Listener$-CC, reason: invalid class name */
    public abstract /* synthetic */ class CC {
        public static void $default$onCloseWithOutcome(Stream0Listener stream0Listener, ET9 et9, String str) {
            C7384Etj.A0Y(str, 2);
            stream0Listener.onClose(str);
        }

        public static void $default$onCloseWithOutcomeNative(Stream0Listener stream0Listener, int i, String str) {
            C7384Etj.A0Y(str, 2);
            stream0Listener.onCloseWithOutcome(i != 3 ? i != 4 ? ET9.A06 : ET9.A03 : ET9.A02, str);
        }

        public static void $default$onFailure(Stream0Listener stream0Listener, int i, String str) {
            C7384Etj.A0Y(str, 2);
            stream0Listener.onClose(str);
        }

        public static void $default$onReadyWithOutcomeNative(Stream0Listener stream0Listener, int i) {
            ET9 et9;
            if (i == 1) {
                et9 = ET9.A04;
            } else {
                if (i != 2) {
                    stream0Listener.onCloseWithOutcome(ET9.A06, "noise.handshake.private_auth.invalid_ready_outcome");
                    return;
                }
                et9 = ET9.A05;
            }
            stream0Listener.onReadyWithOutcome(et9);
        }

        public static void $default$onTransportReady(Stream0Listener stream0Listener) {
        }

        public static /* synthetic */ void access$onTransportReady$jd(Stream0Listener stream0Listener) {
        }

        public static void $default$onFailureDiagnostic(Stream0Listener stream0Listener, String str) {
        }

        public static void $default$onWebSocketUpgraded(Stream0Listener stream0Listener, String str) {
        }

        public static /* synthetic */ void access$onFailureDiagnostic$jd(Stream0Listener stream0Listener, String str) {
        }

        public static /* synthetic */ void access$onWebSocketUpgraded$jd(Stream0Listener stream0Listener, String str) {
        }

        public static void $default$onPreconnectTiming(Stream0Listener stream0Listener, boolean z, long j, long j2, long j3) {
        }

        public static /* synthetic */ void access$onPreconnectTiming$jd(Stream0Listener stream0Listener, boolean z, long j, long j2, long j3) {
        }
    }

    public abstract class DefaultImpls {
        @Deprecated
        public static void onCloseWithOutcomeNative(Stream0Listener stream0Listener, int i, String str) {
            C7384Etj.A0Y(str, 2);
            CC.$default$onCloseWithOutcomeNative(stream0Listener, i, str);
        }

        @Deprecated
        public static void onFailure(Stream0Listener stream0Listener, int i, String str) {
            C7384Etj.A0Y(str, 2);
            stream0Listener.onClose(str);
        }

        @Deprecated
        public static void onFailureDiagnostic(Stream0Listener stream0Listener, String str) {
            C7384Etj.A0Y(str, 1);
        }

        @Deprecated
        public static void onReadyWithOutcome(Stream0Listener stream0Listener, ET9 et9) {
            C7384Etj.A0Y(et9, 1);
            stream0Listener.onReady();
        }

        @Deprecated
        public static void onWebSocketUpgraded(Stream0Listener stream0Listener, String str) {
            C7384Etj.A0Y(str, 1);
        }

        @Deprecated
        public static void onCloseWithOutcome(Stream0Listener stream0Listener, ET9 et9, String str) {
            AnonymousClass003.A0x(et9, str);
            stream0Listener.onClose(str);
        }

        @Deprecated
        public static void onTransportReady(Stream0Listener stream0Listener) {
        }

        @Deprecated
        public static void onReadyWithOutcomeNative(Stream0Listener stream0Listener, int i) {
            CC.$default$onReadyWithOutcomeNative(stream0Listener, i);
        }

        @Deprecated
        public static void onPreconnectTiming(Stream0Listener stream0Listener, boolean z, long j, long j2, long j3) {
        }
    }
}
