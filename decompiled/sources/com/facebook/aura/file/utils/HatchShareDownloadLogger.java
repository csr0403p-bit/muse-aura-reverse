package com.facebook.aura.file.utils;

import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C3cG;
import X.C60O;
import X.C60R;
import X.C7520Ez2;
import X.DK9;
import X.FGI;
import X.GD1;
import X.GD7;
import X.InterfaceC7539F0o;
import android.os.SystemClock;
import com.facebook.aura.plog.HatchShareDownloadDebug;
import com.facebook.aura.plog.HatchShareDownloadDebugPLogConfigGenerated;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HatchShareDownloadLogger {
    public static final int $stable = 0;
    public static final HatchShareDownloadLogger INSTANCE = new HatchShareDownloadLogger();
    public static final GD7<HatchShareDownloadDebugPLogConfigGenerated> plog = GD1.A00(HatchShareDownloadDebug.HatchShareDownloadDebugPLogConfig);
    public static final DK9 clock = new C7520Ez2(new InterfaceC7539F0o() { // from class: com.facebook.aura.file.utils.HatchShareDownloadLogger$clock$1
        @Override // X.InterfaceC7539F0o
        public final long now() {
            return SystemClock.uptimeMillis();
        }
    });

    /* renamed from: com.facebook.aura.file.utils.HatchShareDownloadLogger$logActionException$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<String> {
        public final /* synthetic */ String $action;
        public final /* synthetic */ long $elapsedMs;
        public final /* synthetic */ Exception $exception;
        public final /* synthetic */ String $path;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, String str2, Exception exc, long j) {
            super(0);
            this.$action = str;
            this.$path = str2;
            this.$exception = exc;
            this.$elapsedMs = j;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            String str = this.$action;
            String str2 = this.$path;
            String strA0n = C60O.A0n(this.$exception);
            String message = this.$exception.getMessage();
            long j = this.$elapsedMs;
            StringBuilder sbA0g = C3cG.A0g(str);
            sbA0g.append(": exception path=");
            sbA0g.append(str2);
            sbA0g.append(" exceptionType=");
            sbA0g.append(strA0n);
            C60R.A1K(" message=", message, sbA0g, j);
            return sbA0g.toString();
        }
    }

    /* renamed from: com.facebook.aura.file.utils.HatchShareDownloadLogger$logActionFailed$1, reason: invalid class name and case insensitive filesystem */
    public final class C119251 extends AbstractC7559F3s implements Function0<String> {
        public final /* synthetic */ String $action;
        public final /* synthetic */ long $elapsedMs;
        public final /* synthetic */ String $path;
        public final /* synthetic */ String $reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C119251(String str, String str2, String str3, long j) {
            super(0);
            this.$action = str;
            this.$path = str2;
            this.$reason = str3;
            this.$elapsedMs = j;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            String str = this.$action;
            String str2 = this.$path;
            String str3 = this.$reason;
            long j = this.$elapsedMs;
            StringBuilder sbA0g = C3cG.A0g(str);
            sbA0g.append(": failed path=");
            sbA0g.append(str2);
            C60R.A1K(" reason=", str3, sbA0g, j);
            return sbA0g.toString();
        }
    }

    /* renamed from: com.facebook.aura.file.utils.HatchShareDownloadLogger$logActionStarted$1, reason: invalid class name and case insensitive filesystem */
    public final class C119261 extends AbstractC7559F3s implements Function0<String> {
        public final /* synthetic */ String $action;
        public final /* synthetic */ String $fileName;
        public final /* synthetic */ String $path;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C119261(String str, String str2, String str3) {
            super(0);
            this.$action = str;
            this.$path = str2;
            this.$fileName = str3;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return FGI.A0h(this.$action, ": started path=", this.$path, " fileName=", this.$fileName);
        }
    }

    /* renamed from: com.facebook.aura.file.utils.HatchShareDownloadLogger$logActionSuccess$1, reason: invalid class name and case insensitive filesystem */
    public final class C119271 extends AbstractC7559F3s implements Function0<String> {
        public final /* synthetic */ String $action;
        public final /* synthetic */ long $elapsedMs;
        public final /* synthetic */ String $path;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C119271(String str, String str2, long j) {
            super(0);
            this.$action = str;
            this.$path = str2;
            this.$elapsedMs = j;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            String str = this.$action;
            String str2 = this.$path;
            long j = this.$elapsedMs;
            StringBuilder sbA0g = C3cG.A0g(str);
            C60R.A1K(": success path=", str2, sbA0g, j);
            return sbA0g.toString();
        }
    }

    public final long now() {
        return clock.now();
    }

    public final void logActionException(String str, String str2, Exception exc, long j) {
        AnonymousClass005.A0x(str, str2, exc);
        plog.A9n(exc, new AnonymousClass1(str, str2, exc, j));
    }

    public final void logActionFailed(String str, String str2, String str3, long j) {
        AnonymousClass005.A0x(str, str2, str3);
        plog.A9o(new C119251(str, str2, str3, j));
    }

    public final void logActionStarted(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        plog.ANP(new C119261(str, str2, str3));
    }

    public final void logActionSuccess(String str, String str2, long j) {
        AnonymousClass003.A0u(str, str2);
        plog.ANP(new C119271(str, str2, j));
    }
}
