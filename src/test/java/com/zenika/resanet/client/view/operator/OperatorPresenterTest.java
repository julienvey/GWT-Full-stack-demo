package com.zenika.resanet.client.view.operator;

import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.user.client.ui.HasValue;
import com.google.inject.Inject;
import com.zenika.resanet.shared.dto.Operator;
import com.zenika.resanet.shared.dto.OperatorRole;
import org.jukito.JukitoRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.mockito.Mockito.*;

@RunWith(JukitoRunner.class)
public class OperatorPresenterTest {

    @Inject
    OperatorView operatorView;

    @Inject
    OperatorPresenter presenter;

    @Inject
    PlaceController placeController;

    Operator operator;

    @Before
    public void setUp() {
        operator = new Operator();
        operator.setLogin("testOpLogin");
        operator.setPhone("testOpPhone");
        operator.setLastName("testOpLastName");
        operator.setFirstName("testOpFirstName");
        operator.setEmail("testOpEmail");
        operator.setPassword("testOpPassword");
        operator.setRole(OperatorRole.ADMINISTRATEUR);
    }

    @Test
    public void testDoStart_nullOperator() throws Exception {
        //Given
        when(placeController.getWhere()).thenReturn(new OperatorPlace(null));

        //When
        presenter.doStart();

        //Then
        verify(operatorView).setPresenter(presenter);
        verify(placeController).getWhere();
        verifyNoMoreInteractions(operatorView);
        verifyNoMoreInteractions(placeController);

    }

    @Test
    public void testDoStart_anyOperator() throws Exception {
        //Given
        when(placeController.getWhere()).thenReturn(new OperatorPlace(operator));
        HasValue<String> loginInput = mock(HasValue.class);
        HasValue<String> phoneInput = mock(HasValue.class);
        HasValue<String> lastNameInput = mock(HasValue.class);
        HasValue<String> firstNameInut = mock(HasValue.class);
        HasValue<String> emailInput = mock(HasValue.class);
        HasValue<String> passwordInput = mock(HasValue.class);
        HasValue<String> roleInput = mock(HasValue.class);
        when(operatorView.getLoginInput()).thenReturn(loginInput);
        when(operatorView.getFirstNameInput()).thenReturn(firstNameInut);
        when(operatorView.getPhoneInput()).thenReturn(phoneInput);
        when(operatorView.getLastNameInput()).thenReturn(lastNameInput);
        when(operatorView.getMailInput()).thenReturn(emailInput);
        when(operatorView.getPasswordInput()).thenReturn(passwordInput);
        when(operatorView.getRoleInput()).thenReturn(roleInput);

        //When
        presenter.doStart();

        //Then
        verify(operatorView).setPresenter(presenter);
        verify(placeController).getWhere();

        verify(operatorView).getLoginInput();
        verify(operatorView).getFirstNameInput();
        verify(operatorView).getPhoneInput();
        verify(operatorView).getLastNameInput();
        verify(operatorView).getMailInput();
        verify(operatorView).getPasswordInput();
        verify(operatorView).getRoleInput();

        verify(loginInput).setValue(eq("testOpLogin"));
        verify(phoneInput).setValue(eq("testOpPhone"));
        verify(lastNameInput).setValue(eq("testOpLastName"));
        verify(firstNameInut).setValue(eq("testOpFirstName"));
        verify(emailInput).setValue(eq("testOpEmail"));
        verify(passwordInput).setValue(eq("testOpPassword"));
        verify(roleInput).setValue(eq(OperatorRole.ADMINISTRATEUR.name()));

        verifyNoMoreInteractions(operatorView);
        verifyNoMoreInteractions(placeController);

        verifyNoMoreInteractions(loginInput);
        verifyNoMoreInteractions(phoneInput);
        verifyNoMoreInteractions(lastNameInput);
        verifyNoMoreInteractions(firstNameInut);
        verifyNoMoreInteractions(emailInput);
        verifyNoMoreInteractions(passwordInput);
        verifyNoMoreInteractions(roleInput);

    }

    @Test
    public void testReset() throws Exception {
        //Given
        HasValue<String> loginInput = mock(HasValue.class);
        HasValue<String> phoneInput = mock(HasValue.class);
        HasValue<String> lastNameInput = mock(HasValue.class);
        HasValue<String> firstNameInut = mock(HasValue.class);
        HasValue<String> emailInput = mock(HasValue.class);
        HasValue<String> passwordInput = mock(HasValue.class);
        HasValue<String> roleInput = mock(HasValue.class);
        when(operatorView.getLoginInput()).thenReturn(loginInput);
        when(operatorView.getFirstNameInput()).thenReturn(firstNameInut);
        when(operatorView.getPhoneInput()).thenReturn(phoneInput);
        when(operatorView.getLastNameInput()).thenReturn(lastNameInput);
        when(operatorView.getMailInput()).thenReturn(emailInput);
        when(operatorView.getPasswordInput()).thenReturn(passwordInput);
        when(operatorView.getRoleInput()).thenReturn(roleInput);

        //When
        presenter.reset();

        //Then
        verify(operatorView).setPresenter(presenter);

        verify(operatorView).getLoginInput();
        verify(operatorView).getFirstNameInput();
        verify(operatorView).getPhoneInput();
        verify(operatorView).getLastNameInput();
        verify(operatorView).getMailInput();
        verify(operatorView).getPasswordInput();
        verify(operatorView).getRoleInput();

        verify(loginInput).setValue((String) isNull());
        verify(firstNameInut).setValue((String) isNull());
        verify(phoneInput).setValue((String) isNull());
        verify(lastNameInput).setValue((String) isNull());
        verify(emailInput).setValue((String) isNull());
        verify(passwordInput).setValue((String) isNull());
        verify(roleInput).setValue((String) isNull());

        verifyNoMoreInteractions(operatorView);

        verifyNoMoreInteractions(loginInput);
        verifyNoMoreInteractions(firstNameInut);
        verifyNoMoreInteractions(phoneInput);
        verifyNoMoreInteractions(lastNameInput);
        verifyNoMoreInteractions(emailInput);
        verifyNoMoreInteractions(passwordInput);
        verifyNoMoreInteractions(roleInput);

    }

    @Test
    public void testSaveOperator() {
        //TODO
    }
}
