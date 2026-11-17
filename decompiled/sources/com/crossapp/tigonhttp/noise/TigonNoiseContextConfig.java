package com.crossapp.tigonhttp.noise;

import X.AnonymousClass003;
import X.AnonymousClass004;
import X.BWL;
import X.C06H;
import X.C3cG;
import X.C7384Etj;

/* loaded from: classes5.dex */
public final class TigonNoiseContextConfig {
    public final int connectTimeoutMs;
    public final boolean httpZstdEnabled;
    public final String httpZstdPaths;
    public final boolean httpZstdUploadsEnabled;
    public final boolean includeSafeFailureDiagnostics;
    public final long maxMessageBytes;
    public final int noiseHandshakeTimeoutMs;
    public final int pingIntervalMs;
    public final String[] subprotocols;
    public final BWL transportPolicy;
    public final int transportPolicyNativeCode;
    public final int upgradeTimeoutMs;

    public static /* synthetic */ void getTransportPolicyNativeCode$annotations() {
    }

    public final int getConnectTimeoutMs() {
        return this.connectTimeoutMs;
    }

    public final boolean getHttpZstdEnabled() {
        return this.httpZstdEnabled;
    }

    public final String getHttpZstdPaths() {
        return this.httpZstdPaths;
    }

    public final boolean getHttpZstdUploadsEnabled() {
        return this.httpZstdUploadsEnabled;
    }

    public final boolean getIncludeSafeFailureDiagnostics() {
        return this.includeSafeFailureDiagnostics;
    }

    public final long getMaxMessageBytes() {
        return this.maxMessageBytes;
    }

    public final int getNoiseHandshakeTimeoutMs() {
        return this.noiseHandshakeTimeoutMs;
    }

    public final int getPingIntervalMs() {
        return this.pingIntervalMs;
    }

    public final String[] getSubprotocols() {
        return this.subprotocols;
    }

    public final BWL getTransportPolicy() {
        return this.transportPolicy;
    }

    public final int getUpgradeTimeoutMs() {
        return this.upgradeTimeoutMs;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public TigonNoiseContextConfig() {
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        Object[] objArr6 = 0 == true ? 1 : 0;
        this(null, objArr, 0, objArr4, objArr5, objArr6, 0L, 0 == true ? 1 : 0, objArr2, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 2047, objArr3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public TigonNoiseContextConfig(BWL bwl) {
        C7384Etj.A0Y(bwl, 0);
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        Object[] objArr6 = 0 == true ? 1 : 0;
        this(bwl, null, 0, objArr, objArr2, objArr3, 0L, objArr4, 0 == true ? 1 : 0, objArr5, objArr6, 2046, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TigonNoiseContextConfig(BWL bwl, String[] strArr) {
        boolean zA1b = AnonymousClass004.A1b(bwl, strArr);
        this(bwl, strArr, zA1b ? 1 : 0, 10000, zA1b ? 1 : 0, zA1b ? 1 : 0, 16777216L, zA1b, "", zA1b, zA1b);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TigonNoiseContextConfig(BWL bwl, String[] strArr, int i) {
        boolean zA1b = AnonymousClass004.A1b(bwl, strArr);
        this(bwl, strArr, i, 10000, zA1b ? 1 : 0, zA1b ? 1 : 0, 16777216L, zA1b, "", zA1b, zA1b);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TigonNoiseContextConfig(BWL bwl, String[] strArr, int i, int i2) {
        boolean zA1b = AnonymousClass004.A1b(bwl, strArr);
        this(bwl, strArr, i, i2, zA1b ? 1 : 0, zA1b ? 1 : 0, 16777216L, zA1b, "", zA1b, zA1b);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TigonNoiseContextConfig(BWL bwl, String[] strArr, int i, int i2, int i3) {
        boolean zA1b = AnonymousClass004.A1b(bwl, strArr);
        this(bwl, strArr, i, i2, i3, zA1b ? 1 : 0, 16777216L, zA1b, "", zA1b, zA1b);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TigonNoiseContextConfig(BWL bwl, String[] strArr, int i, int i2, int i3, int i4, long j, boolean z) {
        boolean zA1b = AnonymousClass004.A1b(bwl, strArr);
        this(bwl, strArr, i, i2, i3, i4, j, z, "", zA1b, zA1b);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TigonNoiseContextConfig(BWL bwl, String[] strArr, int i, int i2, int i3, int i4, long j, boolean z, String str) {
        boolean zA1b = AnonymousClass004.A1b(bwl, strArr);
        C7384Etj.A0Y(str, 8);
        this(bwl, strArr, i, i2, i3, i4, j, z, str, zA1b, zA1b);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TigonNoiseContextConfig(BWL bwl, String[] strArr, int i, int i2, int i3, int i4) {
        boolean zA1b = AnonymousClass004.A1b(bwl, strArr);
        this(bwl, strArr, i, i2, i3, i4, 16777216L, zA1b, "", zA1b, zA1b);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TigonNoiseContextConfig(BWL bwl, String[] strArr, int i, int i2, int i3, int i4, long j, boolean z, String str, boolean z2) {
        boolean zA1b = AnonymousClass004.A1b(bwl, strArr);
        C7384Etj.A0Y(str, 8);
        this(bwl, strArr, i, i2, i3, i4, j, z, str, z2, zA1b);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TigonNoiseContextConfig(BWL bwl, String[] strArr, int i, int i2, int i3, int i4, long j) {
        boolean zA1b = AnonymousClass004.A1b(bwl, strArr);
        this(bwl, strArr, i, i2, i3, i4, j, zA1b, "", zA1b, zA1b);
    }

    public TigonNoiseContextConfig(BWL bwl, String[] strArr, int i, int i2, int i3, int i4, long j, boolean z, String str, boolean z2, boolean z3) {
        AnonymousClass003.A0u(bwl, strArr);
        C7384Etj.A0Y(str, 8);
        this.transportPolicy = bwl;
        this.subprotocols = strArr;
        this.pingIntervalMs = i;
        this.connectTimeoutMs = i2;
        this.upgradeTimeoutMs = i3;
        this.noiseHandshakeTimeoutMs = i4;
        this.maxMessageBytes = j;
        this.httpZstdEnabled = z;
        this.httpZstdPaths = str;
        this.httpZstdUploadsEnabled = z2;
        this.includeSafeFailureDiagnostics = z3;
        this.transportPolicyNativeCode = bwl.nativeCode;
    }

    public /* synthetic */ TigonNoiseContextConfig(BWL bwl, String[] strArr, int i, int i2, int i3, int i4, long j, boolean z, String str, boolean z2, boolean z3, int i5, C06H c06h) {
        this((i5 & 1) != 0 ? BWL.A02 : bwl, (i5 & 2) != 0 ? new String[0] : strArr, (i5 & 4) != 0 ? 0 : i, (i5 & 8) != 0 ? 10000 : i2, (i5 & 16) != 0 ? 0 : i3, (i5 & 32) != 0 ? 0 : i4, (i5 & 64) != 0 ? 16777216L : j, (i5 & 128) != 0 ? false : z, (i5 & 256) != 0 ? "" : str, (i5 & 512) != 0 ? false : z2, C3cG.A1K(i5 & 1024, z3));
    }
}
