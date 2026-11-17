package com.facebook.aura.model;

import X.C06H;
import X.C3cG;
import X.C7384Etj;
import X.Ey9;
import com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class BrowserTaskDisplayStatus {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ BrowserTaskDisplayStatus[] $VALUES;
    public static final BrowserTaskDisplayStatus COMPLETED;
    public static final Companion Companion;
    public static final BrowserTaskDisplayStatus FAILED;
    public static final BrowserTaskDisplayStatus NEEDS_YOU;
    public static final BrowserTaskDisplayStatus PAUSED;
    public static final BrowserTaskDisplayStatus QUEUED;
    public static final String REASON_AWAITING_INPUT_TIMED_OUT = "awaiting_user_input_timed_out";
    public static final String REASON_CONTROL_HEARTBEAT_TIMED_OUT = "user_control_heartbeat_timed_out";
    public static final BrowserTaskDisplayStatus STARTING;
    public static final BrowserTaskDisplayStatus STOPPED;
    public static final BrowserTaskDisplayStatus WAITING;
    public static final BrowserTaskDisplayStatus WORKING;

    public final class Companion {
        public final BrowserTaskDisplayStatus fromDisplayStatus(String str) {
            String str2;
            C7384Etj.A0Y(str, 0);
            String strNormalized$fbandroid_express_aura_java_com_facebook_aura_model_model = BrowserTaskPresentation.Companion.normalized$fbandroid_express_aura_java_com_facebook_aura_model_model(str);
            switch (strNormalized$fbandroid_express_aura_java_com_facebook_aura_model_model.hashCode()) {
                case -1884319283:
                    if (strNormalized$fbandroid_express_aura_java_com_facebook_aura_model_model.equals("stopped")) {
                        return BrowserTaskDisplayStatus.STOPPED;
                    }
                    return null;
                case -1402931637:
                    if (strNormalized$fbandroid_express_aura_java_com_facebook_aura_model_model.equals("completed")) {
                        return BrowserTaskDisplayStatus.COMPLETED;
                    }
                    return null;
                case -1281977283:
                    if (strNormalized$fbandroid_express_aura_java_com_facebook_aura_model_model.equals("failed")) {
                        return BrowserTaskDisplayStatus.FAILED;
                    }
                    return null;
                case -995321554:
                    if (strNormalized$fbandroid_express_aura_java_com_facebook_aura_model_model.equals("paused")) {
                        return BrowserTaskDisplayStatus.PAUSED;
                    }
                    return null;
                case -948696717:
                    if (strNormalized$fbandroid_express_aura_java_com_facebook_aura_model_model.equals("queued")) {
                        return BrowserTaskDisplayStatus.QUEUED;
                    }
                    return null;
                case -435997651:
                    str2 = BrowserTaskPresentation.STATUS_NEEDS_USER;
                    break;
                case 1094317949:
                    if (strNormalized$fbandroid_express_aura_java_com_facebook_aura_model_model.equals("needs_you")) {
                        return BrowserTaskDisplayStatus.NEEDS_YOU;
                    }
                    return null;
                case 1116313165:
                    str2 = "waiting";
                    break;
                case 1316806720:
                    if (strNormalized$fbandroid_express_aura_java_com_facebook_aura_model_model.equals("starting")) {
                        return BrowserTaskDisplayStatus.STARTING;
                    }
                    return null;
                case 1525164849:
                    if (strNormalized$fbandroid_express_aura_java_com_facebook_aura_model_model.equals("working")) {
                        return BrowserTaskDisplayStatus.WORKING;
                    }
                    return null;
                default:
                    return null;
            }
            if (strNormalized$fbandroid_express_aura_java_com_facebook_aura_model_model.equals(str2)) {
                return BrowserTaskDisplayStatus.WAITING;
            }
            return null;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
        
            if (r1.equals("failed") == false) goto L4;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0070, code lost:
        
            if (r2.equals(com.facebook.aura.model.BrowserTaskDisplayStatus.REASON_AWAITING_INPUT_TIMED_OUT) != false) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x007b, code lost:
        
            if (r2.equals("user_stop") == false) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x0084, code lost:
        
            if (r2.equals(com.facebook.aura.model.BrowserTaskDisplayStatus.REASON_CONTROL_HEARTBEAT_TIMED_OUT) != false) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0088, code lost:
        
            return com.facebook.aura.model.BrowserTaskDisplayStatus.NEEDS_YOU;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x009a, code lost:
        
            if (r1.equals("stopped") == false) goto L4;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x00a0, code lost:
        
            return com.facebook.aura.model.BrowserTaskDisplayStatus.STOPPED;
         */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.facebook.aura.model.BrowserTaskDisplayStatus fromStatus(java.lang.String r3, java.lang.String r4) {
            /*
                r2 = this;
                X.AnonymousClass003.A0u(r3, r4)
                com.facebook.aura.model.BrowserTaskPresentation$Companion r2 = com.facebook.aura.model.BrowserTaskPresentation.Companion
                java.lang.String r1 = r2.normalized$fbandroid_express_aura_java_com_facebook_aura_model_model(r3)
                int r0 = r1.hashCode()
                switch(r0) {
                    case -1884319283: goto L94;
                    case -1700134442: goto L4b;
                    case -1402931637: goto L89;
                    case -1281977283: goto L42;
                    case -948696717: goto L37;
                    case -435997651: goto L29;
                    case 106703273: goto L2c;
                    case 1316806720: goto L1e;
                    case 1972572290: goto L13;
                    default: goto L10;
                }
            L10:
                com.facebook.aura.model.BrowserTaskDisplayStatus r0 = com.facebook.aura.model.BrowserTaskDisplayStatus.WORKING
                return r0
            L13:
                java.lang.String r0 = "user_controlled"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L10
                com.facebook.aura.model.BrowserTaskDisplayStatus r0 = com.facebook.aura.model.BrowserTaskDisplayStatus.PAUSED
                return r0
            L1e:
                java.lang.String r0 = "starting"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L10
                com.facebook.aura.model.BrowserTaskDisplayStatus r0 = com.facebook.aura.model.BrowserTaskDisplayStatus.STARTING
                return r0
            L29:
                java.lang.String r0 = "needs_user"
                goto L2e
            L2c:
                java.lang.String r0 = "awaiting_user_input"
            L2e:
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L10
                com.facebook.aura.model.BrowserTaskDisplayStatus r0 = com.facebook.aura.model.BrowserTaskDisplayStatus.WAITING
                return r0
            L37:
                java.lang.String r0 = "queued"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L10
                com.facebook.aura.model.BrowserTaskDisplayStatus r0 = com.facebook.aura.model.BrowserTaskDisplayStatus.QUEUED
                return r0
            L42:
                java.lang.String r0 = "failed"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L72
                goto L10
            L4b:
                java.lang.String r0 = "superseded"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L10
                java.lang.String r2 = r2.normalized$fbandroid_express_aura_java_com_facebook_aura_model_model(r4)
                int r1 = r2.hashCode()
                r0 = -1269707155(0xffffffffb451ce6d, float:-1.9539739E-7)
                if (r1 == r0) goto L7e
                r0 = 339508214(0x143c7bf6, float:9.5160214E-27)
                if (r1 == r0) goto L75
                r0 = 1487165232(0x58a45730, float:1.445555E15)
                if (r1 != r0) goto L72
                java.lang.String r0 = "awaiting_user_input_timed_out"
                boolean r0 = r2.equals(r0)
                if (r0 != 0) goto L86
            L72:
                com.facebook.aura.model.BrowserTaskDisplayStatus r0 = com.facebook.aura.model.BrowserTaskDisplayStatus.FAILED
                return r0
            L75:
                java.lang.String r0 = "user_stop"
                boolean r0 = r2.equals(r0)
                if (r0 != 0) goto L9e
                goto L72
            L7e:
                java.lang.String r0 = "user_control_heartbeat_timed_out"
                boolean r0 = r2.equals(r0)
                if (r0 == 0) goto L72
            L86:
                com.facebook.aura.model.BrowserTaskDisplayStatus r0 = com.facebook.aura.model.BrowserTaskDisplayStatus.NEEDS_YOU
                return r0
            L89:
                java.lang.String r0 = "completed"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L10
                com.facebook.aura.model.BrowserTaskDisplayStatus r0 = com.facebook.aura.model.BrowserTaskDisplayStatus.COMPLETED
                return r0
            L94:
                java.lang.String r0 = "stopped"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L9e
                goto L10
            L9e:
                com.facebook.aura.model.BrowserTaskDisplayStatus r0 = com.facebook.aura.model.BrowserTaskDisplayStatus.STOPPED
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.model.BrowserTaskDisplayStatus.Companion.fromStatus(java.lang.String, java.lang.String):com.facebook.aura.model.BrowserTaskDisplayStatus");
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        BrowserTaskDisplayStatus browserTaskDisplayStatus = new BrowserTaskDisplayStatus("QUEUED", 0);
        QUEUED = browserTaskDisplayStatus;
        BrowserTaskDisplayStatus browserTaskDisplayStatus2 = new BrowserTaskDisplayStatus("STARTING", 1);
        STARTING = browserTaskDisplayStatus2;
        BrowserTaskDisplayStatus browserTaskDisplayStatus3 = new BrowserTaskDisplayStatus("WORKING", 2);
        WORKING = browserTaskDisplayStatus3;
        BrowserTaskDisplayStatus browserTaskDisplayStatus4 = new BrowserTaskDisplayStatus("WAITING", 3);
        WAITING = browserTaskDisplayStatus4;
        BrowserTaskDisplayStatus browserTaskDisplayStatus5 = new BrowserTaskDisplayStatus("PAUSED", 4);
        PAUSED = browserTaskDisplayStatus5;
        BrowserTaskDisplayStatus browserTaskDisplayStatus6 = new BrowserTaskDisplayStatus("COMPLETED", 5);
        COMPLETED = browserTaskDisplayStatus6;
        BrowserTaskDisplayStatus browserTaskDisplayStatus7 = new BrowserTaskDisplayStatus(CvmMigrationStatusJson.STAGE_FAILED, 6);
        FAILED = browserTaskDisplayStatus7;
        BrowserTaskDisplayStatus browserTaskDisplayStatus8 = new BrowserTaskDisplayStatus("STOPPED", 7);
        STOPPED = browserTaskDisplayStatus8;
        BrowserTaskDisplayStatus browserTaskDisplayStatus9 = new BrowserTaskDisplayStatus("NEEDS_YOU", 8);
        NEEDS_YOU = browserTaskDisplayStatus9;
        BrowserTaskDisplayStatus[] browserTaskDisplayStatusArr = {browserTaskDisplayStatus, browserTaskDisplayStatus2, browserTaskDisplayStatus3, browserTaskDisplayStatus4, browserTaskDisplayStatus5, browserTaskDisplayStatus6, browserTaskDisplayStatus7, browserTaskDisplayStatus8, browserTaskDisplayStatus9};
        $VALUES = browserTaskDisplayStatusArr;
        $ENTRIES = C3cG.A0w(browserTaskDisplayStatusArr);
        Companion = new Companion();
    }

    public static Ey9<BrowserTaskDisplayStatus> getEntries() {
        return $ENTRIES;
    }

    public static BrowserTaskDisplayStatus valueOf(String str) {
        return (BrowserTaskDisplayStatus) Enum.valueOf(BrowserTaskDisplayStatus.class, str);
    }

    public static BrowserTaskDisplayStatus[] values() {
        return (BrowserTaskDisplayStatus[]) $VALUES.clone();
    }

    public BrowserTaskDisplayStatus(String str, int i) {
    }
}
