package com.facebook.quicklog.reliability;

import X.C7384Etj;
import com.facebook.quicklog.PointEditor;

/* loaded from: classes4.dex */
public final class UserFlowJSI {
    public final UserFlowLogger userFlowLogger;

    public UserFlowJSI(UserFlowLogger userFlowLogger) {
        C7384Etj.A0Y(userFlowLogger, 0);
        this.userFlowLogger = userFlowLogger;
    }

    public final void userFlowStart(int i, int i2, String str, boolean z) {
        C7384Etj.A0Y(str, 2);
        this.userFlowLogger.flowStart(this.userFlowLogger.generateFlowId(i, i2), new UserFlowConfig(str, z));
    }

    public final void userFlowStartIfNotOngoing(int i, int i2, String str, boolean z) {
        C7384Etj.A0Y(str, 2);
        this.userFlowLogger.flowStartIfNotOngoing(this.userFlowLogger.generateFlowId(i, i2), new UserFlowConfig(str, z));
    }

    public static final int extractInstanceId(long j) {
        return (int) (j >>> 32);
    }

    public final void userFlowAddAnnotation(int i, int i2, String str, String str2) {
        this.userFlowLogger.flowAnnotate(this.userFlowLogger.generateFlowId(i, i2), str, str2);
    }

    public final void userFlowEndCancel(int i, int i2, String str) {
        this.userFlowLogger.flowEndCancel(this.userFlowLogger.generateFlowId(i, i2), str);
    }

    public final void userFlowEndFail(int i, int i2, String str, String str2) {
        this.userFlowLogger.flowEndFail(this.userFlowLogger.generateFlowId(i, i2), str, str2);
    }

    public final void userFlowEndSuccess(int i, int i2) {
        this.userFlowLogger.flowEndSuccess(this.userFlowLogger.generateFlowId(i, i2));
    }

    public final int userFlowGetNextInstanceKey(int i) {
        return (int) (this.userFlowLogger.generateNewFlowId(i) >>> 32);
    }

    public final void userFlowMarkPoint(int i, int i2, String str) {
        this.userFlowLogger.flowMarkPoint(this.userFlowLogger.generateFlowId(i, i2), str);
    }

    public final PointEditor userFlowPointEditor(int i, int i2, String str) {
        PointEditor pointEditorMarkPointWithEditor = this.userFlowLogger.markPointWithEditor(this.userFlowLogger.generateFlowId(i, i2), str);
        C7384Etj.A0U(pointEditorMarkPointWithEditor);
        return pointEditorMarkPointWithEditor;
    }

    public final void userFlowAddAnnotation(int i, int i2, String str, boolean z) {
        this.userFlowLogger.flowAnnotate(this.userFlowLogger.generateFlowId(i, i2), str, z);
    }
}
