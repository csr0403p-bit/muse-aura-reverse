package com.facebook.aura.analytics.impl;

import X.BV4;
import X.C06H;
import X.C4931DFd;
import X.C60O;
import X.C7384Etj;
import X.C9M;
import X.CI8;
import X.CIB;
import X.DFz;

/* loaded from: classes5.dex */
public final class MetaAnalyticsSessionIdGenerator implements DFz, CI8 {
    public static final Companion Companion = new Companion();
    public static final String SESSION_ID_PREFIX = "UFS";
    public static MetaAnalyticsSessionIdGenerator instance;
    public CIB appState;
    public String processId;
    public int sequenceId;
    public final boolean updateSessionIdOnBgFg;
    public final boolean updateSessionIdOnUserChange;

    public final class Companion {
        public static /* synthetic */ void getSESSION_ID_PREFIX$annotations() {
        }

        public final synchronized MetaAnalyticsSessionIdGenerator getExistingInstance() {
            return MetaAnalyticsSessionIdGenerator.instance;
        }

        public final synchronized MetaAnalyticsSessionIdGenerator getInstance(boolean z, boolean z2) {
            if (MetaAnalyticsSessionIdGenerator.instance == null) {
                MetaAnalyticsSessionIdGenerator metaAnalyticsSessionIdGenerator = new MetaAnalyticsSessionIdGenerator(z, z2);
                MetaAnalyticsSessionIdGenerator.instance = metaAnalyticsSessionIdGenerator;
                MetaAnalyticsSessionManager.instance.registerCallback(metaAnalyticsSessionIdGenerator);
            }
            return MetaAnalyticsSessionIdGenerator.instance;
        }

        public final String getSESSION_ID_PREFIX() {
            return MetaAnalyticsSessionIdGenerator.SESSION_ID_PREFIX;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static /* synthetic */ void getProcessId$annotations() {
    }

    public static /* synthetic */ void getSequenceId$annotations() {
    }

    @Override // X.DFz
    public /* synthetic */ void clientModeStateChanged() {
    }

    @Override // X.DFz
    public synchronized void onBackground() {
        if (this.updateSessionIdOnBgFg) {
            this.sequenceId++;
            this.appState = CIB.BACKGROUND;
        }
    }

    @Override // X.DFz
    public synchronized void onForeground() {
        if (this.updateSessionIdOnBgFg) {
            CIB cib = this.appState;
            CIB cib2 = CIB.FOREGROUND;
            if (cib != cib2) {
                this.sequenceId++;
                this.appState = cib2;
            }
        }
    }

    @Override // X.CI8
    public synchronized String provideSessionId() {
        StringBuilder sbA0w;
        sbA0w = C60O.A0w();
        sbA0w.append(SESSION_ID_PREFIX);
        sbA0w.append("-");
        sbA0w.append(this.processId);
        sbA0w.append("-");
        sbA0w.append(this.appState.mValue);
        sbA0w.append("-");
        return BV4.A0l(sbA0w, this.sequenceId);
    }

    public final void setProcessId(String str) {
        C7384Etj.A0Y(str, 0);
        this.processId = str;
    }

    @Override // X.DFz
    public void userConsentChanged() {
    }

    @Override // X.DFz
    public synchronized void userLogin(C4931DFd c4931DFd) {
        if (this.updateSessionIdOnUserChange) {
            this.sequenceId++;
        }
    }

    @Override // X.DFz
    public void userLogout() {
    }

    public final String getProcessId() {
        return this.processId;
    }

    public final int getSequenceId() {
        return this.sequenceId;
    }

    public MetaAnalyticsSessionIdGenerator(boolean z, boolean z2) {
        this.updateSessionIdOnUserChange = z;
        this.updateSessionIdOnBgFg = z2;
        this.processId = C9M.A00();
        this.appState = CIB.FOREGROUND;
    }

    public final void setSequenceId(int i) {
        this.sequenceId = i;
    }

    public /* synthetic */ MetaAnalyticsSessionIdGenerator(boolean z, boolean z2, C06H c06h) {
        this(z, z2);
    }
}
