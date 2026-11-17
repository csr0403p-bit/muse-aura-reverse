package com.hatch.browser.protocol;

import X.AbstractC7607F5u;
import X.AbstractC7608F5v;
import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AbstractC7611F5y;
import X.C3cG;
import X.C60P;
import X.C7384Etj;
import com.hatch.browser.protocol.Command;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes6.dex */
public final class FfiConverterTypeCommand implements FfiConverterRustBuffer<Command> {
    public static final int $stable = 0;
    public static final FfiConverterTypeCommand INSTANCE = new FfiConverterTypeCommand();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(Command command) {
        long jMo3323allocationSizeI7RO_PI;
        long jMo3323allocationSizeI7RO_PI2;
        FfiConverterTypeElementRef ffiConverterTypeElementRef;
        ElementRef elementRef;
        long jMo3323allocationSizeI7RO_PI3;
        C7384Etj.A0Y(command, 0);
        if (!(command instanceof Command.VisualProgram)) {
            if (!(command instanceof Command.Observe)) {
                if (!(command instanceof Command.Info)) {
                    if (command instanceof Command.ReadPage) {
                        Command.ReadPage readPage = (Command.ReadPage) command;
                        jMo3323allocationSizeI7RO_PI = 8 + FfiConverterOptionalString.INSTANCE.mo3323allocationSizeI7RO_PI(readPage.query);
                        jMo3323allocationSizeI7RO_PI2 = FfiConverterOptionalTypeCaptureOptions.INSTANCE.mo3323allocationSizeI7RO_PI(readPage.capture);
                    } else if (command instanceof Command.ReadElement) {
                        Command.ReadElement readElement = (Command.ReadElement) command;
                        jMo3323allocationSizeI7RO_PI = FfiConverterTypeElementRef.INSTANCE.mo3323allocationSizeI7RO_PI(readElement.element) + 4;
                        jMo3323allocationSizeI7RO_PI2 = FfiConverterTypeElementReadKind.INSTANCE.mo3323allocationSizeI7RO_PI(readElement.read);
                    } else if (command instanceof Command.ReadElementFields) {
                        Command.ReadElementFields readElementFields = (Command.ReadElementFields) command;
                        jMo3323allocationSizeI7RO_PI = FfiConverterTypeElementRef.INSTANCE.mo3323allocationSizeI7RO_PI(readElementFields.element) + 4;
                        jMo3323allocationSizeI7RO_PI2 = FfiConverterSequenceTypeElementReadKind.INSTANCE.mo3323allocationSizeI7RO_PI((List<? extends ElementReadKind>) readElementFields.reads);
                    } else if (command instanceof Command.Wait) {
                        Command.Wait wait = (Command.Wait) command;
                        jMo3323allocationSizeI7RO_PI = FfiConverterTypeWaitCondition.INSTANCE.mo3323allocationSizeI7RO_PI(wait.condition) + 4;
                        jMo3323allocationSizeI7RO_PI2 = FfiConverterTypeWaitOptions.INSTANCE.mo3323allocationSizeI7RO_PI(wait.options);
                    } else if (command instanceof Command.Click) {
                        jMo3323allocationSizeI7RO_PI = FfiConverterTypeElementRef.INSTANCE.mo3323allocationSizeI7RO_PI(((Command.Click) command).element) + 4 + 4;
                        jMo3323allocationSizeI7RO_PI2 = 1;
                    } else {
                        if (command instanceof Command.Hover) {
                            ffiConverterTypeElementRef = FfiConverterTypeElementRef.INSTANCE;
                            elementRef = ((Command.Hover) command).element;
                        } else if (command instanceof Command.Focus) {
                            ffiConverterTypeElementRef = FfiConverterTypeElementRef.INSTANCE;
                            elementRef = ((Command.Focus) command).element;
                        } else if (command instanceof Command.Fill) {
                            Command.Fill fill = (Command.Fill) command;
                            jMo3323allocationSizeI7RO_PI = AbstractC7607F5u.A0R(FfiConverterString.INSTANCE, fill.text, FfiConverterTypeElementRef.INSTANCE.mo3323allocationSizeI7RO_PI(fill.element) + 4) + 4 + FfiConverterOptionalTypeSubmitIntent.INSTANCE.mo3323allocationSizeI7RO_PI(fill.submit);
                            jMo3323allocationSizeI7RO_PI2 = AbstractC7610F5x.A0W(fill.entry);
                        } else if (command instanceof Command.Select) {
                            Command.Select select = (Command.Select) command;
                            jMo3323allocationSizeI7RO_PI = FfiConverterTypeElementRef.INSTANCE.mo3323allocationSizeI7RO_PI(select.element) + 4;
                            jMo3323allocationSizeI7RO_PI2 = FfiConverterString.INSTANCE.mo3323allocationSizeI7RO_PI(select.value);
                        } else if (command instanceof Command.SetChecked) {
                            jMo3323allocationSizeI7RO_PI = FfiConverterTypeElementRef.INSTANCE.mo3323allocationSizeI7RO_PI(((Command.SetChecked) command).element) + 4;
                            jMo3323allocationSizeI7RO_PI2 = 1;
                        } else if (command instanceof Command.Press) {
                            Command.Press press = (Command.Press) command;
                            jMo3323allocationSizeI7RO_PI = FfiConverterTypeInputTarget.INSTANCE.mo3323allocationSizeI7RO_PI(press.target) + 4;
                            jMo3323allocationSizeI7RO_PI2 = FfiConverterSequenceTypeKeyChord.INSTANCE.mo3323allocationSizeI7RO_PI(press.keys);
                        } else if (command instanceof Command.Scroll) {
                            jMo3323allocationSizeI7RO_PI3 = FfiConverterTypeScrollOperation.INSTANCE.mo3323allocationSizeI7RO_PI(((Command.Scroll) command).operation);
                        } else if (command instanceof Command.ResumeSubmit) {
                            jMo3323allocationSizeI7RO_PI3 = FfiConverterTypeSubmitContinuation.INSTANCE.mo3323allocationSizeI7RO_PI(((Command.ResumeSubmit) command).continuation);
                        } else if (command instanceof Command.Navigate) {
                            jMo3323allocationSizeI7RO_PI3 = FfiConverterString.INSTANCE.mo3323allocationSizeI7RO_PI(((Command.Navigate) command).url);
                        } else if (command instanceof Command.History) {
                            jMo3323allocationSizeI7RO_PI3 = 4;
                        } else if (!(command instanceof Command.Reload)) {
                            if (command instanceof Command.CredentialRefsPreflight) {
                                Command.CredentialRefsPreflight credentialRefsPreflight = (Command.CredentialRefsPreflight) command;
                                jMo3323allocationSizeI7RO_PI = FfiConverterSequenceTypeElementRef.INSTANCE.mo3323allocationSizeI7RO_PI(credentialRefsPreflight.elements) + 4 + 4;
                                jMo3323allocationSizeI7RO_PI2 = FfiConverterTypeExpectedOrigins.INSTANCE.mo3323allocationSizeI7RO_PI(credentialRefsPreflight.origins);
                            } else if (command instanceof Command.CredentialFill) {
                                Command.CredentialFill credentialFill = (Command.CredentialFill) command;
                                jMo3323allocationSizeI7RO_PI = AbstractC7607F5u.A0R(FfiConverterString.INSTANCE, credentialFill.value, FfiConverterTypeCredentialProof.INSTANCE.mo3323allocationSizeI7RO_PI(credentialFill.proof) + 4 + 4);
                                jMo3323allocationSizeI7RO_PI2 = FfiConverterOptionalString.INSTANCE.mo3323allocationSizeI7RO_PI(credentialFill.sealedValue);
                            } else if (command instanceof Command.CredentialClear) {
                                jMo3323allocationSizeI7RO_PI = FfiConverterTypeCredentialProof.INSTANCE.mo3323allocationSizeI7RO_PI(((Command.CredentialClear) command).proof) + 4;
                                jMo3323allocationSizeI7RO_PI2 = 4;
                            } else if (!(command instanceof Command.ShopifyCheckout)) {
                                if (command instanceof Command.ShopPayApprove) {
                                    Command.ShopPayApprove shopPayApprove = (Command.ShopPayApprove) command;
                                    long jMo3323allocationSizeI7RO_PI4 = FfiConverterTypeDocumentKey.INSTANCE.mo3323allocationSizeI7RO_PI(shopPayApprove.expectedDocument) + 4;
                                    FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
                                    jMo3323allocationSizeI7RO_PI = AbstractC7607F5u.A0R(ffiConverterString, shopPayApprove.expectedOrigin, jMo3323allocationSizeI7RO_PI4);
                                    jMo3323allocationSizeI7RO_PI2 = ffiConverterString.mo3323allocationSizeI7RO_PI(shopPayApprove.approvalId);
                                } else if (command instanceof Command.Capture) {
                                    jMo3323allocationSizeI7RO_PI = FfiConverterTypeCaptureOptions.INSTANCE.mo3323allocationSizeI7RO_PI(((Command.Capture) command).options) + 4;
                                    jMo3323allocationSizeI7RO_PI2 = 1;
                                } else if (command instanceof Command.CaptureChallenge) {
                                    Command.CaptureChallenge captureChallenge = (Command.CaptureChallenge) command;
                                    jMo3323allocationSizeI7RO_PI = FfiConverterTypeElementRef.INSTANCE.mo3323allocationSizeI7RO_PI(captureChallenge.element) + 4 + FfiConverterTypeDocumentKey.INSTANCE.mo3323allocationSizeI7RO_PI(captureChallenge.expectedDocument);
                                    jMo3323allocationSizeI7RO_PI2 = FfiConverterTypeCaptureOptions.INSTANCE.mo3323allocationSizeI7RO_PI(captureChallenge.options);
                                } else if (command instanceof Command.PointerPath) {
                                    Command.PointerPath pointerPath = (Command.PointerPath) command;
                                    jMo3323allocationSizeI7RO_PI = 8 + FfiConverterSequenceTypePoint.INSTANCE.mo3323allocationSizeI7RO_PI(pointerPath.points) + FfiConverterTypeCoordinateScope.INSTANCE.mo3323allocationSizeI7RO_PI(pointerPath.scope) + 4 + AbstractC7610F5x.A0W(pointerPath.clickHoldMs);
                                    jMo3323allocationSizeI7RO_PI2 = FfiConverterOptionalTypeChallengeProof.INSTANCE.mo3323allocationSizeI7RO_PI(pointerPath.challengeProof);
                                } else if (command instanceof Command.Pdf) {
                                    C7384Etj.A0Y(((Command.Pdf) command).options, 0);
                                    jMo3323allocationSizeI7RO_PI3 = 2;
                                } else if (command instanceof Command.ClickAt) {
                                    Command.ClickAt clickAt = (Command.ClickAt) command;
                                    C7384Etj.A0Y(clickAt.point, 0);
                                    jMo3323allocationSizeI7RO_PI = 20 + FfiConverterTypeCoordinateScope.INSTANCE.mo3323allocationSizeI7RO_PI(clickAt.scope) + 4;
                                    jMo3323allocationSizeI7RO_PI2 = 1;
                                } else if (command instanceof Command.FillAt) {
                                    Command.FillAt fillAt = (Command.FillAt) command;
                                    C7384Etj.A0Y(fillAt.point, 0);
                                    jMo3323allocationSizeI7RO_PI = AbstractC7607F5u.A0R(FfiConverterString.INSTANCE, fillAt.text, 20 + FfiConverterTypeCoordinateScope.INSTANCE.mo3323allocationSizeI7RO_PI(fillAt.scope));
                                    jMo3323allocationSizeI7RO_PI2 = 4;
                                } else if (command instanceof Command.ScrollAt) {
                                    Command.ScrollAt scrollAt = (Command.ScrollAt) command;
                                    C7384Etj.A0Y(scrollAt.point, 0);
                                    jMo3323allocationSizeI7RO_PI = 20 + FfiConverterTypeCoordinateScope.INSTANCE.mo3323allocationSizeI7RO_PI(scrollAt.scope) + 4;
                                    jMo3323allocationSizeI7RO_PI2 = 4;
                                } else if (command instanceof Command.Upload) {
                                    Command.Upload upload = (Command.Upload) command;
                                    jMo3323allocationSizeI7RO_PI = FfiConverterTypeElementRef.INSTANCE.mo3323allocationSizeI7RO_PI(upload.element) + 4;
                                    jMo3323allocationSizeI7RO_PI2 = FfiConverterSequenceTypeFileRef.INSTANCE.mo3323allocationSizeI7RO_PI(upload.files);
                                } else if (command instanceof Command.UploadProbe) {
                                    ffiConverterTypeElementRef = FfiConverterTypeElementRef.INSTANCE;
                                    elementRef = ((Command.UploadProbe) command).element;
                                } else {
                                    if (!(command instanceof Command.Download)) {
                                        throw C3cG.A0q();
                                    }
                                    Command.Download download = (Command.Download) command;
                                    jMo3323allocationSizeI7RO_PI = FfiConverterOptionalTypeElementRef.INSTANCE.mo3323allocationSizeI7RO_PI(download.target) + 4;
                                    jMo3323allocationSizeI7RO_PI2 = FfiConverterString.INSTANCE.mo3323allocationSizeI7RO_PI(download.destination);
                                }
                            }
                        }
                        jMo3323allocationSizeI7RO_PI3 = ffiConverterTypeElementRef.mo3323allocationSizeI7RO_PI(elementRef);
                    }
                }
                return 4L;
            }
            jMo3323allocationSizeI7RO_PI3 = FfiConverterTypeObserveOptions.INSTANCE.mo3323allocationSizeI7RO_PI(((Command.Observe) command).options);
            return jMo3323allocationSizeI7RO_PI3 + 4;
        }
        jMo3323allocationSizeI7RO_PI = FfiConverterString.INSTANCE.mo3323allocationSizeI7RO_PI(((Command.VisualProgram) command).source) + 4 + 4;
        jMo3323allocationSizeI7RO_PI2 = 1;
        return jMo3323allocationSizeI7RO_PI + jMo3323allocationSizeI7RO_PI2;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ Command lift(RustBuffer.ByValue byValue) {
        return (Command) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ Command liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (Command) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(Command command) {
        return lower((Object) command);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(Command command) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, command);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public Command read(ByteBuffer byteBuffer) {
        switch (AbstractC7609F5w.A0H(byteBuffer)) {
            case 1:
                return new Command.VisualProgram(AbstractC7607F5u.A12(byteBuffer), byteBuffer.getInt(), AbstractC7610F5x.A1V(FfiConverterBoolean.INSTANCE, byteBuffer));
            case 2:
                return new Command.Observe(FfiConverterTypeObserveOptions.INSTANCE.read(byteBuffer));
            case 3:
                return Command.Info.INSTANCE;
            case 4:
                return new Command.ReadPage(FfiConverterTypePageReadKind.INSTANCE.read(byteBuffer), AbstractC7607F5u.A11(byteBuffer), FfiConverterOptionalTypeCaptureOptions.INSTANCE.read(byteBuffer));
            case 5:
                return new Command.ReadElement(FfiConverterTypeElementRef.INSTANCE.read(byteBuffer), FfiConverterTypeElementReadKind.INSTANCE.read(byteBuffer));
            case 6:
                return new Command.ReadElementFields(FfiConverterTypeElementRef.INSTANCE.read(byteBuffer), FfiConverterSequenceTypeElementReadKind.INSTANCE.read(byteBuffer));
            case 7:
                return new Command.Wait(FfiConverterTypeWaitCondition.INSTANCE.read(byteBuffer), FfiConverterTypeWaitOptions.INSTANCE.read(byteBuffer));
            case 8:
                return new Command.Click(FfiConverterTypeElementRef.INSTANCE.read(byteBuffer), FfiConverterTypeMouseButton.INSTANCE.read(byteBuffer), byteBuffer.get());
            case 9:
                return new Command.Hover(FfiConverterTypeElementRef.INSTANCE.read(byteBuffer));
            case 10:
                return new Command.Focus(FfiConverterTypeElementRef.INSTANCE.read(byteBuffer));
            case 11:
                return new Command.Fill(FfiConverterTypeElementRef.INSTANCE.read(byteBuffer), AbstractC7607F5u.A12(byteBuffer), FfiConverterTypeTextMode.INSTANCE.read(byteBuffer), FfiConverterOptionalTypeSubmitIntent.INSTANCE.read(byteBuffer), FfiConverterOptionalTypeTextEntry.INSTANCE.read(byteBuffer));
            case 12:
                return new Command.Select(FfiConverterTypeElementRef.INSTANCE.read(byteBuffer), AbstractC7607F5u.A12(byteBuffer));
            case 13:
                return new Command.SetChecked(FfiConverterTypeElementRef.INSTANCE.read(byteBuffer), AbstractC7610F5x.A1V(FfiConverterBoolean.INSTANCE, byteBuffer));
            case 14:
                return new Command.Press(FfiConverterTypeInputTarget.INSTANCE.read(byteBuffer), FfiConverterSequenceTypeKeyChord.INSTANCE.read(byteBuffer));
            case 15:
                return new Command.Scroll(FfiConverterTypeScrollOperation.INSTANCE.read(byteBuffer));
            case 16:
                return new Command.ResumeSubmit(new SubmitContinuation(AbstractC7610F5x.A0z(byteBuffer)));
            case 17:
                return new Command.Navigate(AbstractC7607F5u.A12(byteBuffer));
            case 18:
                return new Command.History(byteBuffer.getInt());
            case 19:
                return Command.Reload.INSTANCE;
            case 20:
                return new Command.CredentialRefsPreflight(FfiConverterSequenceTypeElementRef.INSTANCE.read(byteBuffer), FfiConverterTypeCredentialFieldKind.INSTANCE.read(byteBuffer), FfiConverterTypeExpectedOrigins.INSTANCE.read(byteBuffer));
            case 21:
                return new Command.CredentialFill(new CredentialProof(AbstractC7610F5x.A0z(byteBuffer)), FfiConverterTypeCredentialFieldKind.INSTANCE.read(byteBuffer), AbstractC7607F5u.A12(byteBuffer), AbstractC7607F5u.A11(byteBuffer));
            case 22:
                return new Command.CredentialClear(new CredentialProof(AbstractC7610F5x.A0z(byteBuffer)), FfiConverterTypeCredentialFieldKind.INSTANCE.read(byteBuffer));
            case 23:
                return Command.ShopifyCheckout.INSTANCE;
            case 24:
                DocumentKey documentKey = new DocumentKey(AbstractC7610F5x.A0z(byteBuffer));
                FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
                return new Command.ShopPayApprove(documentKey, ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer));
            case 25:
                return new Command.Capture(FfiConverterTypeCaptureOptions.INSTANCE.read(byteBuffer), AbstractC7610F5x.A1V(FfiConverterBoolean.INSTANCE, byteBuffer));
            case 26:
                return new Command.CaptureChallenge(FfiConverterTypeElementRef.INSTANCE.read(byteBuffer), new DocumentKey(AbstractC7610F5x.A0z(byteBuffer)), FfiConverterTypeCaptureOptions.INSTANCE.read(byteBuffer));
            case 27:
                return new Command.PointerPath(FfiConverterTypePointerPathAction.INSTANCE.read(byteBuffer), FfiConverterSequenceTypePoint.INSTANCE.read(byteBuffer), FfiConverterTypeCoordinateScope.INSTANCE.read(byteBuffer), FfiConverterTypePointerMotionProfile.INSTANCE.read(byteBuffer), FfiConverterOptionalUInt.INSTANCE.read(byteBuffer), FfiConverterOptionalTypeChallengeProof.INSTANCE.read(byteBuffer));
            case 28:
                return new Command.Pdf(FfiConverterTypePdfOptions.INSTANCE.read(byteBuffer));
            case 29:
                return new Command.ClickAt(FfiConverterTypePoint.INSTANCE.read(byteBuffer), FfiConverterTypeCoordinateScope.INSTANCE.read(byteBuffer), FfiConverterTypeMouseButton.INSTANCE.read(byteBuffer), byteBuffer.get());
            case 30:
                return new Command.FillAt(FfiConverterTypePoint.INSTANCE.read(byteBuffer), FfiConverterTypeCoordinateScope.INSTANCE.read(byteBuffer), AbstractC7607F5u.A12(byteBuffer), FfiConverterTypeTextMode.INSTANCE.read(byteBuffer));
            case 31:
                return new Command.ScrollAt(FfiConverterTypePoint.INSTANCE.read(byteBuffer), FfiConverterTypeCoordinateScope.INSTANCE.read(byteBuffer), FfiConverterTypeScrollDirection.INSTANCE.read(byteBuffer), byteBuffer.getInt());
            case 32:
                return new Command.Upload(FfiConverterTypeElementRef.INSTANCE.read(byteBuffer), FfiConverterSequenceTypeFileRef.INSTANCE.read(byteBuffer));
            case 33:
                return new Command.UploadProbe(FfiConverterTypeElementRef.INSTANCE.read(byteBuffer));
            case 34:
                return new Command.Download(FfiConverterOptionalTypeElementRef.INSTANCE.read(byteBuffer), AbstractC7607F5u.A12(byteBuffer));
            default:
                throw AbstractC7608F5v.A0l();
        }
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(Command command, ByteBuffer byteBuffer) {
        FfiConverterString ffiConverterString;
        String str;
        FfiConverterTypeElementRef ffiConverterTypeElementRef;
        ElementRef elementRef;
        int i;
        byte b;
        FfiConverterBoolean ffiConverterBoolean;
        boolean z;
        boolean zA1Y = C60P.A1Y(command, byteBuffer);
        if (!(command instanceof Command.VisualProgram)) {
            if (command instanceof Command.Observe) {
                byteBuffer.putInt(2);
                FfiConverterTypeObserveOptions.INSTANCE.write(((Command.Observe) command).options, byteBuffer);
                return;
            }
            if (!(command instanceof Command.Info)) {
                if (command instanceof Command.ReadPage) {
                    byteBuffer.putInt(4);
                    Command.ReadPage readPage = (Command.ReadPage) command;
                    AbstractC7611F5y.A0q(readPage.read, byteBuffer);
                    FfiConverterOptionalString.INSTANCE.write(readPage.query, byteBuffer);
                    FfiConverterOptionalTypeCaptureOptions.INSTANCE.write(readPage.capture, byteBuffer);
                    return;
                }
                if (command instanceof Command.ReadElement) {
                    byteBuffer.putInt(5);
                    Command.ReadElement readElement = (Command.ReadElement) command;
                    FfiConverterTypeElementRef.INSTANCE.write(readElement.element, byteBuffer);
                    FfiConverterTypeElementReadKind.INSTANCE.write(readElement.read, byteBuffer);
                    return;
                }
                if (command instanceof Command.ReadElementFields) {
                    byteBuffer.putInt(6);
                    Command.ReadElementFields readElementFields = (Command.ReadElementFields) command;
                    FfiConverterTypeElementRef.INSTANCE.write(readElementFields.element, byteBuffer);
                    FfiConverterSequenceTypeElementReadKind.INSTANCE.write((List<? extends ElementReadKind>) readElementFields.reads, byteBuffer);
                    return;
                }
                if (command instanceof Command.Wait) {
                    byteBuffer.putInt(7);
                    Command.Wait wait = (Command.Wait) command;
                    FfiConverterTypeWaitCondition.INSTANCE.write(wait.condition, byteBuffer);
                    FfiConverterTypeWaitOptions.INSTANCE.write(wait.options, byteBuffer);
                    return;
                }
                if (!(command instanceof Command.Click)) {
                    if (command instanceof Command.Hover) {
                        byteBuffer.putInt(9);
                        ffiConverterTypeElementRef = FfiConverterTypeElementRef.INSTANCE;
                        elementRef = ((Command.Hover) command).element;
                    } else {
                        if (!(command instanceof Command.Focus)) {
                            if (command instanceof Command.Fill) {
                                byteBuffer.putInt(11);
                                Command.Fill fill = (Command.Fill) command;
                                FfiConverterTypeElementRef.INSTANCE.write(fill.element, byteBuffer);
                                FfiConverterString.INSTANCE.write(fill.text, byteBuffer);
                                AbstractC7611F5y.A0q(fill.mode, byteBuffer);
                                FfiConverterOptionalTypeSubmitIntent.INSTANCE.write(fill.submit, byteBuffer);
                                FfiConverterOptionalTypeTextEntry.INSTANCE.write(fill.entry, byteBuffer);
                                return;
                            }
                            if (command instanceof Command.Select) {
                                byteBuffer.putInt(12);
                                Command.Select select = (Command.Select) command;
                                FfiConverterTypeElementRef.INSTANCE.write(select.element, byteBuffer);
                                ffiConverterString = FfiConverterString.INSTANCE;
                                str = select.value;
                            } else if (command instanceof Command.SetChecked) {
                                byteBuffer.putInt(13);
                                Command.SetChecked setChecked = (Command.SetChecked) command;
                                FfiConverterTypeElementRef.INSTANCE.write(setChecked.element, byteBuffer);
                                ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
                                z = setChecked.checked;
                            } else {
                                if (command instanceof Command.Press) {
                                    byteBuffer.putInt(14);
                                    Command.Press press = (Command.Press) command;
                                    FfiConverterTypeInputTarget.INSTANCE.write(press.target, byteBuffer);
                                    FfiConverterSequenceTypeKeyChord.INSTANCE.write(press.keys, byteBuffer);
                                    return;
                                }
                                if (command instanceof Command.Scroll) {
                                    byteBuffer.putInt(15);
                                    FfiConverterTypeScrollOperation.INSTANCE.write(((Command.Scroll) command).operation, byteBuffer);
                                    return;
                                }
                                if (command instanceof Command.ResumeSubmit) {
                                    byteBuffer.putInt(16);
                                    FfiConverterTypeSubmitContinuation.INSTANCE.write(((Command.ResumeSubmit) command).continuation, byteBuffer);
                                    return;
                                }
                                if (command instanceof Command.Navigate) {
                                    byteBuffer.putInt(17);
                                    ffiConverterString = FfiConverterString.INSTANCE;
                                    str = ((Command.Navigate) command).url;
                                } else if (command instanceof Command.History) {
                                    byteBuffer.putInt(18);
                                    i = ((Command.History) command).delta;
                                } else if (command instanceof Command.Reload) {
                                    i = 19;
                                } else {
                                    if (command instanceof Command.CredentialRefsPreflight) {
                                        byteBuffer.putInt(20);
                                        Command.CredentialRefsPreflight credentialRefsPreflight = (Command.CredentialRefsPreflight) command;
                                        FfiConverterSequenceTypeElementRef.INSTANCE.write(credentialRefsPreflight.elements, byteBuffer);
                                        AbstractC7611F5y.A0q(credentialRefsPreflight.fieldKind, byteBuffer);
                                        FfiConverterTypeExpectedOrigins.INSTANCE.write(credentialRefsPreflight.origins, byteBuffer);
                                        return;
                                    }
                                    if (command instanceof Command.CredentialFill) {
                                        byteBuffer.putInt(21);
                                        Command.CredentialFill credentialFill = (Command.CredentialFill) command;
                                        FfiConverterTypeCredentialProof.INSTANCE.write(credentialFill.proof, byteBuffer);
                                        AbstractC7611F5y.A0q(credentialFill.fieldKind, byteBuffer);
                                        FfiConverterString.INSTANCE.write(credentialFill.value, byteBuffer);
                                        FfiConverterOptionalString.INSTANCE.write(credentialFill.sealedValue, byteBuffer);
                                        return;
                                    }
                                    if (command instanceof Command.CredentialClear) {
                                        byteBuffer.putInt(22);
                                        Command.CredentialClear credentialClear = (Command.CredentialClear) command;
                                        FfiConverterTypeCredentialProof.INSTANCE.write(credentialClear.proof, byteBuffer);
                                        AbstractC7611F5y.A0q(credentialClear.fieldKind, byteBuffer);
                                        return;
                                    }
                                    if (command instanceof Command.ShopifyCheckout) {
                                        i = 23;
                                    } else if (command instanceof Command.ShopPayApprove) {
                                        byteBuffer.putInt(24);
                                        Command.ShopPayApprove shopPayApprove = (Command.ShopPayApprove) command;
                                        FfiConverterTypeDocumentKey.INSTANCE.write(shopPayApprove.expectedDocument, byteBuffer);
                                        ffiConverterString = FfiConverterString.INSTANCE;
                                        ffiConverterString.write(shopPayApprove.expectedOrigin, byteBuffer);
                                        str = shopPayApprove.approvalId;
                                    } else if (command instanceof Command.Capture) {
                                        byteBuffer.putInt(25);
                                        Command.Capture capture = (Command.Capture) command;
                                        FfiConverterTypeCaptureOptions.INSTANCE.write(capture.options, byteBuffer);
                                        ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
                                        z = capture.fullPage;
                                    } else {
                                        if (command instanceof Command.CaptureChallenge) {
                                            byteBuffer.putInt(26);
                                            Command.CaptureChallenge captureChallenge = (Command.CaptureChallenge) command;
                                            FfiConverterTypeElementRef.INSTANCE.write(captureChallenge.element, byteBuffer);
                                            FfiConverterTypeDocumentKey.INSTANCE.write(captureChallenge.expectedDocument, byteBuffer);
                                            FfiConverterTypeCaptureOptions.INSTANCE.write(captureChallenge.options, byteBuffer);
                                            return;
                                        }
                                        if (command instanceof Command.PointerPath) {
                                            byteBuffer.putInt(27);
                                            Command.PointerPath pointerPath = (Command.PointerPath) command;
                                            AbstractC7611F5y.A0q(pointerPath.action, byteBuffer);
                                            FfiConverterSequenceTypePoint.INSTANCE.write(pointerPath.points, byteBuffer);
                                            FfiConverterTypeCoordinateScope.INSTANCE.write(pointerPath.scope, byteBuffer);
                                            AbstractC7611F5y.A0q(pointerPath.motionProfile, byteBuffer);
                                            FfiConverterOptionalUInt.INSTANCE.write(pointerPath.clickHoldMs, byteBuffer);
                                            FfiConverterOptionalTypeChallengeProof.INSTANCE.write(pointerPath.challengeProof, byteBuffer);
                                            return;
                                        }
                                        if (command instanceof Command.Pdf) {
                                            byteBuffer.putInt(28);
                                            FfiConverterTypePdfOptions.INSTANCE.write(((Command.Pdf) command).options, byteBuffer);
                                            return;
                                        }
                                        if (command instanceof Command.ClickAt) {
                                            byteBuffer.putInt(29);
                                            Command.ClickAt clickAt = (Command.ClickAt) command;
                                            FfiConverterTypePoint.INSTANCE.write(clickAt.point, byteBuffer);
                                            FfiConverterTypeCoordinateScope.INSTANCE.write(clickAt.scope, byteBuffer);
                                            AbstractC7611F5y.A0q(clickAt.button, byteBuffer);
                                            b = clickAt.clickCount;
                                        } else {
                                            if (command instanceof Command.FillAt) {
                                                byteBuffer.putInt(30);
                                                Command.FillAt fillAt = (Command.FillAt) command;
                                                FfiConverterTypePoint.INSTANCE.write(fillAt.point, byteBuffer);
                                                FfiConverterTypeCoordinateScope.INSTANCE.write(fillAt.scope, byteBuffer);
                                                FfiConverterString.INSTANCE.write(fillAt.text, byteBuffer);
                                                AbstractC7611F5y.A0q(fillAt.mode, byteBuffer);
                                                return;
                                            }
                                            if (command instanceof Command.ScrollAt) {
                                                byteBuffer.putInt(31);
                                                Command.ScrollAt scrollAt = (Command.ScrollAt) command;
                                                FfiConverterTypePoint.INSTANCE.write(scrollAt.point, byteBuffer);
                                                FfiConverterTypeCoordinateScope.INSTANCE.write(scrollAt.scope, byteBuffer);
                                                AbstractC7611F5y.A0q(scrollAt.direction, byteBuffer);
                                                i = scrollAt.pixels;
                                            } else {
                                                if (command instanceof Command.Upload) {
                                                    byteBuffer.putInt(32);
                                                    Command.Upload upload = (Command.Upload) command;
                                                    FfiConverterTypeElementRef.INSTANCE.write(upload.element, byteBuffer);
                                                    FfiConverterSequenceTypeFileRef.INSTANCE.write(upload.files, byteBuffer);
                                                    return;
                                                }
                                                if (command instanceof Command.UploadProbe) {
                                                    byteBuffer.putInt(33);
                                                    ffiConverterTypeElementRef = FfiConverterTypeElementRef.INSTANCE;
                                                    elementRef = ((Command.UploadProbe) command).element;
                                                } else {
                                                    if (!(command instanceof Command.Download)) {
                                                        throw C3cG.A0q();
                                                    }
                                                    byteBuffer.putInt(34);
                                                    Command.Download download = (Command.Download) command;
                                                    FfiConverterOptionalTypeElementRef.INSTANCE.write(download.target, byteBuffer);
                                                    ffiConverterString = FfiConverterString.INSTANCE;
                                                    str = download.destination;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            ffiConverterString.write(str, byteBuffer);
                            return;
                        }
                        byteBuffer.putInt(10);
                        ffiConverterTypeElementRef = FfiConverterTypeElementRef.INSTANCE;
                        elementRef = ((Command.Focus) command).element;
                    }
                    ffiConverterTypeElementRef.write(elementRef, byteBuffer);
                    return;
                }
                byteBuffer.putInt(8);
                Command.Click click = (Command.Click) command;
                FfiConverterTypeElementRef.INSTANCE.write(click.element, byteBuffer);
                AbstractC7611F5y.A0q(click.button, byteBuffer);
                b = click.clickCount;
                byteBuffer.put(b);
                return;
            }
            i = 3;
            byteBuffer.putInt(i);
            return;
        }
        byteBuffer.putInt(zA1Y ? 1 : 0);
        Command.VisualProgram visualProgram = (Command.VisualProgram) command;
        FfiConverterString.INSTANCE.write(visualProgram.source, byteBuffer);
        byteBuffer.putInt(visualProgram.timeoutMs);
        ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        z = visualProgram.feedback;
        ffiConverterBoolean.write(z, byteBuffer);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ /* synthetic */ Object lift(RustBuffer.ByValue byValue) {
        return AbstractC7610F5x.A0r(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ /* synthetic */ Object liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: lowerIntoRustBuffer */
    public /* bridge */ /* synthetic */ RustBuffer.ByValue lower(Object obj) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, obj);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.Command, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ Command lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
