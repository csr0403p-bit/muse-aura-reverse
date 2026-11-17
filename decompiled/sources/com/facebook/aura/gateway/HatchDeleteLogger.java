package com.facebook.aura.gateway;

import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C3cG;
import X.C3cI;
import X.C60O;
import X.C60P;
import X.C60R;
import X.C7384Etj;
import X.C7520Ez2;
import X.DK9;
import X.FGI;
import X.GD1;
import X.GD7;
import X.InterfaceC7539F0o;
import android.os.SystemClock;
import com.facebook.aura.plog.HatchDeleteDebug;
import com.facebook.aura.plog.HatchDeleteDebugPLogConfigGenerated;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HatchDeleteLogger {
    public static final int $stable = 0;
    public static final HatchDeleteLogger INSTANCE = new HatchDeleteLogger();
    public static final GD7<HatchDeleteDebugPLogConfigGenerated> plog = GD1.A00(HatchDeleteDebug.HatchDeleteDebugPLogConfig);
    public static final DK9 clock = new C7520Ez2(new InterfaceC7539F0o() { // from class: com.facebook.aura.gateway.HatchDeleteLogger$clock$1
        @Override // X.InterfaceC7539F0o
        public final long now() {
            return SystemClock.uptimeMillis();
        }
    });

    /* renamed from: com.facebook.aura.gateway.HatchDeleteLogger$logDeleteConfirmed$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<String> {
        public final /* synthetic */ String $fileName;
        public final /* synthetic */ String $relativePath;
        public final /* synthetic */ String $source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, String str2, String str3) {
            super(0);
            this.$source = str;
            this.$relativePath = str2;
            this.$fileName = str3;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return FGI.A0j("delete: confirmed source=", this.$source, " path=", this.$relativePath, " fileName=", this.$fileName);
        }
    }

    /* renamed from: com.facebook.aura.gateway.HatchDeleteLogger$logDeleteException$1, reason: invalid class name and case insensitive filesystem */
    public final class C120641 extends AbstractC7559F3s implements Function0<String> {
        public final /* synthetic */ long $elapsedMs;
        public final /* synthetic */ Exception $exception;
        public final /* synthetic */ String $relativePath;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C120641(String str, long j, Exception exc) {
            super(0);
            this.$relativePath = str;
            this.$elapsedMs = j;
            this.$exception = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            String str = this.$relativePath;
            long j = this.$elapsedMs;
            String strA0n = C60O.A0n(this.$exception);
            String message = this.$exception.getMessage();
            StringBuilder sbA0x = C3cI.A0x("deleteFile: exception path=", str);
            sbA0x.append(" elapsedMs=");
            sbA0x.append(j);
            sbA0x.append(" exceptionType=");
            sbA0x.append(strA0n);
            return C60P.A1M(" message=", message, sbA0x);
        }
    }

    /* renamed from: com.facebook.aura.gateway.HatchDeleteLogger$logDeleteRequestStarted$1, reason: invalid class name and case insensitive filesystem */
    public final class C120651 extends AbstractC7559F3s implements Function0<String> {
        public final /* synthetic */ boolean $recursive;
        public final /* synthetic */ String $relativePath;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C120651(String str, boolean z) {
            super(0);
            this.$relativePath = str;
            this.$recursive = z;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            String str = this.$relativePath;
            boolean z = this.$recursive;
            StringBuilder sbA0g = C3cG.A0g("deleteFile: starting path=");
            sbA0g.append(str);
            return C60P.A1P(" recursive=", sbA0g, z);
        }
    }

    /* renamed from: com.facebook.aura.gateway.HatchDeleteLogger$logDeleteSuccess$1, reason: invalid class name and case insensitive filesystem */
    public final class C120661 extends AbstractC7559F3s implements Function0<String> {
        public final /* synthetic */ long $elapsedMs;
        public final /* synthetic */ String $relativePath;
        public final /* synthetic */ String $resultPath;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C120661(String str, String str2, long j) {
            super(0);
            this.$relativePath = str;
            this.$resultPath = str2;
            this.$elapsedMs = j;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            String str = this.$relativePath;
            String str2 = this.$resultPath;
            long j = this.$elapsedMs;
            StringBuilder sbA0x = C3cI.A0x("deleteFile: success path=", str);
            C60R.A1K(" resultPath=", str2, sbA0x, j);
            return sbA0x.toString();
        }
    }

    public final void logDeleteRequestStarted(String str, boolean z) {
        C7384Etj.A0Y(str, 0);
        plog.ANP(new C120651(str, z));
    }

    public final long now() {
        return clock.now();
    }

    public final void logDeleteConfirmed(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        plog.ANP(new AnonymousClass1(str, str2, str3));
    }

    public final void logDeleteException(String str, long j, Exception exc) {
        AnonymousClass003.A0v(str, exc);
        plog.A9n(exc, new C120641(str, j, exc));
    }

    public final void logDeleteSuccess(String str, String str2, long j) {
        AnonymousClass003.A0u(str, str2);
        plog.ANP(new C120661(str, str2, j));
    }
}
