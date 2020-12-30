import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;

import javax.swing.JOptionPane;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Label;

public class Proton {

	protected Shell shell;
	private Text txtChooseYourFavourite;
	private Label lblMessage;
	private Text txtChooseYourFavourite_1;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Proton window = new Proton();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(859, 570);
		shell.setText("SWT Application");
		
		Button btnProtonPesona = new Button(shell, SWT.NONE);
		btnProtonPesona.addSelectionListener(new SelectionAdapter() {
		});
		btnProtonPesona.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDoubleClick(MouseEvent e) {
				//JOptionPane.showMessageDialog(null, "Specification : \n1. Engine Type : 4 Cylinders In-Line 16 Valve DOHC, VVT \n2. Displacement (cc) : 1,597 \n3. Max Power(kW(PS)/rpm) : 80(109) / 5,750 \n4. Fuel Tank Capacity (litre) : 40\r\n" + 
						//"5. Steering : Electric Power Steering \n6. Minimum Turning Radius (m) : 5.0 \n7. Tyre & Wheel : 185/55 R15 Alloy \n8. Length x Width x Height (mm) : 4,362 x 1,722 x 1,554" + 
						//"9. Boot Space (Litre) : 510 \n10. Color : Snow White, Jet Grey, Armour Silver, Ruby Red, Rosewood Maroon \n11. Car Spec Price : 1.6L Standard MT - RM 42,600 \n12. Monthly Installment (RM) : 507.14 (5 years)");
				lblMessage.setText("Specification : \n1. Engine Type : 4 Cylinders In-Line 16 Valve DOHC, VVT \n2. Displacement (cc) : 1,597 \n3. Max Power(kW(PS)/rpm) : 80(109) / 5,750 \n4. Fuel Tank Capacity (litre) : 40 \n5. Steering : Electric Power Steering \n6. Minimum Turning Radius (m) : 5.0 \n7. Tyre & Wheel : 185/55 R15 Alloy \n8. Length x Width x Height (mm) : 4,362 x 1,722 x 1,554" + 
						"\n9. Boot Space (Litre) : 510 \n10. Color : Snow White, Jet Grey, Armour Silver, Ruby Red, Rosewood Maroon \n11. Car Spec Price : 1.6L Standard MT - RM 42,600 \n12. Monthly Installment (RM) : 507.14 (5 years)");
			}
		});
		btnProtonPesona.setBounds(25, 119, 165, 50);
		btnProtonPesona.setText("Proton Persona");
		
		Button btnProtonSaga = new Button(shell, SWT.NONE);
		btnProtonSaga.addSelectionListener(new SelectionAdapter() {

		});
		btnProtonSaga.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDoubleClick(MouseEvent e) {
				//JOptionPane.showMessageDialog(null, "Specification : \n1. Engine Type : 4 Cylinders In-Line 16 Valve DOHC, VVT \n2. Displacement (cc) : 1,332 \n3. Max Power(kW(PS)/rpm) : 70(95) / 5,750 \n4. Fuel Tank Capacity (litre) : 40\r\n" + 
						//"5. Steering : Hydraulic Power Steering \n6. Minimum Turning Radius (m) : 5.1 \n7. Tyre & Wheel : 185/60 R14 Steel \n8. Length x Width x Height (mm) : 4,331 x 1,689 x 1,491" + 
						//"\n9. Color : Snow White, Jet Grey, Armour Silver, Ruby Red, Rosewood Maroon \n10. Car Spec Price : 1.3L Standard MT - RM 32,800 \n11. Monthly Installment (RM) : 390.48 (5 years)");
				lblMessage.setText("Specification : \n1. Engine Type : 4 Cylinders In-Line 16 Valve DOHC, VVT \n2. Displacement (cc) : 1,332 \n3. Max Power(kW(PS)/rpm) : 70(95) / 5,750 \n4. Fuel Tank Capacity (litre) : 40" + 
						"\n5. Steering : Hydraulic Power Steering \n6. Minimum Turning Radius (m) : 5.1 \n7. Tyre & Wheel : 185/60 R14 Steel \n8. Length x Width x Height (mm) : 4,331 x 1,689 x 1,491" + 
						"\n9. Color : Snow White, Jet Grey, Armour Silver, Ruby Red, Rosewood Maroon \n10. Car Spec Price : 1.3L Standard MT - RM 32,800 \n11. Monthly Installment (RM) : 390.48 (5 years)");
			}
		});
		btnProtonSaga.setBounds(232, 119, 165, 50);
		btnProtonSaga.setText("Proton Saga");
		
		Button btnProtonX = new Button(shell, SWT.NONE);
		btnProtonX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDoubleClick(MouseEvent e) {
				//JOptionPane.showMessageDialog(null, "Specification : \n1. Engine Type : 3 Cylinders In-Line 12 Valve DOHC, Turbocharged \n2. Displacement (cc) : 1,477 \n3. Max Power(kW(PS)/rpm) : 110(150) / 5,500 \n4. Fuel Tank Capacity (litre) : 45\r\n" + 
						//"5. Steering : Electric Power Steering \n6. Minimum Turning Radius (m) : 5.4 \n7. Tyre & Wheel : 215/60 R17 Alloy \n8. Length x Width x Height (mm) : 4,330 x 1,800 x 1,609" + 
						//"\n9. Color : Snow White, Jet Grey, Armour Silver, Ruby Red, Rosewood Maroon \n10. Car Spec Price : 1.5L Standard - RM 79,200 \n11. Monthly Installment (RM) : 942.85 (5 years)");
				lblMessage.setText("Specification : \n1. Engine Type : 3 Cylinders In-Line 12 Valve DOHC, Turbocharged \n2. Displacement (cc) : 1,477 \n3. Max Power(kW(PS)/rpm) : 110(150) / 5,500 \n4. Fuel Tank Capacity (litre) : 45" + 
						"\n5. Steering : Electric Power Steering \n6. Minimum Turning Radius (m) : 5.4 \n7. Tyre & Wheel : 215/60 R17 Alloy \n8. Length x Width x Height (mm) : 4,330 x 1,800 x 1,609" + 
						"\n9. Color : Snow White, Jet Grey, Armour Silver, Ruby Red, Rosewood Maroon \n10. Car Spec Price : 1.5L Standard - RM 79,200 \n11. Monthly Installment (RM) : 942.85 (5 years)");
			}
		});
		btnProtonX.setBounds(443, 119, 165, 50);
		btnProtonX.setText("Proton X50 ");
		
		Button btnProtonX_1 = new Button(shell, SWT.NONE);
		btnProtonX_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDoubleClick(MouseEvent e) {
				//JOptionPane.showMessageDialog(null, "Specification : \n1. Engine Type : 4 Cylinders In-Line 16 Valve DOHC, TGDi \n2. Displacement (cc) : 1,799 \n3. Max Power(kW(PS)/rpm) : 135(184) / 5,500 \n4. Fuel Tank Capacity (litre) : 60\r\n" + 
						//"5. Steering : Electric Power Steering \n6. Minimum Turning Radius (m) : 5.5 \n7. Tyre & Wheel : 225/65 R17 Alloy \n8. Length x Width x Height (mm) : 4,519 x 1,831 x 1,694" + 
						//"\n9. Color : Snow White, Jet Grey, Armour Silver, Ruby Red, Rosewood Maroon \n10. Car Spec Price : 1.8L TGDI Standard 2WD - RM 94,800 \n11. Monthly Installment (RM) : 1,128.57 (5 years)");
				lblMessage.setText("Specification : \n1. Engine Type : 4 Cylinders In-Line 16 Valve DOHC, TGDi \n2. Displacement (cc) : 1,799 \n3. Max Power(kW(PS)/rpm) : 135(184) / 5,500 \n4. Fuel Tank Capacity (litre) : 60" + 
						"\n5. Steering : Electric Power Steering \n6. Minimum Turning Radius (m) : 5.5 \n7. Tyre & Wheel : 225/65 R17 Alloy \n8. Length x Width x Height (mm) : 4,519 x 1,831 x 1,694" + 
						"\n9. Color : Snow White, Jet Grey, Armour Silver, Ruby Red, Rosewood Maroon \n10. Car Spec Price : 1.8L TGDI Standard 2WD - RM 94,800 \n11. Monthly Installment (RM) : 1,128.57 (5 years)");
			}
		});
		btnProtonX_1.setBounds(650, 119, 165, 50);
		btnProtonX_1.setText("Proton X70");
		
		txtChooseYourFavourite = new Text(shell, SWT.READ_ONLY | SWT.CENTER);
		txtChooseYourFavourite.setFont(SWTResourceManager.getFont("Segoe UI", 44, SWT.BOLD));
		txtChooseYourFavourite.setText("PROTON");
		txtChooseYourFavourite.setBounds(80, 10, 691, 69);
		
		lblMessage = new Label(shell, SWT.BORDER);
		lblMessage.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		lblMessage.setBounds(25, 189, 790, 318);
		
		txtChooseYourFavourite_1 = new Text(shell, SWT.READ_ONLY);
		txtChooseYourFavourite_1.setText("Choose Your Favourite Car");
		txtChooseYourFavourite_1.setBounds(346, 81, 165, 21);

	}
}
