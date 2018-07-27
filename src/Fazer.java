

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class Fazer {
	double num1,num2,resultado;

	public void mudaCor(double c, JTextField v) {
		v.setDisabledTextColor(Color.BLACK);
		if (c>=5&&c<=10) {
			v.setBackground(new Color(0, 255, 0));
		}else if (c==404) {
			v.setText("");
			v.setBackground(new Color(255, 255, 255));
		}
		else {
			v.setBackground(new Color(255, 77, 77));
		}
	}
	
	public void salvarpts(JTextField[] campos) throws IOException{
		String path = System.getProperty("user.dir");
		FileWriter cria = new FileWriter(path+"/src/pts.txt");
		BufferedWriter gravarArq = new BufferedWriter(cria);
		for( int i=0; i < campos.length; i++){
			String valor = campos[i].getText();
			gravarArq.write(valor);
			gravarArq.newLine();
		} 
		gravarArq.close();
		cria.close();
	}
	
	public void salvarpp(JTextField[] campos) throws IOException{
		//System.out.println("entrou");
		//System.out.println("Usando propriedade user.dir: " + path);
		String path = System.getProperty("user.dir");
		FileWriter cria = new FileWriter(path+"/src/pp.txt");
		BufferedWriter gravarArq = new BufferedWriter(cria);
		for( int i=0; i < campos.length; i++){
			String valor = campos[i].getText();
			gravarArq.write(valor);
			gravarArq.newLine();
//			System.out.println("salvou");
		} 
		gravarArq.close();
		cria.close();
	}
	
	public void salvarae(JTextField[] campos) throws IOException{
		String path = System.getProperty("user.dir");
		FileWriter cria = new FileWriter(path+"/src/ae.txt");
		BufferedWriter gravarArq = new BufferedWriter(cria);
		for( int i=0; i < campos.length; i++){
			String valor = campos[i].getText();
			gravarArq.write(valor);
			gravarArq.newLine();
		} 
		gravarArq.close();
		cria.close();
	}
	public void salvarpe(JTextField[] campos) throws IOException{
		String path = System.getProperty("user.dir");
		FileWriter cria = new FileWriter(path+"/src/pe.txt");
		BufferedWriter gravarArq = new BufferedWriter(cria);
		for( int i=0; i < campos.length; i++){
			String valor = campos[i].getText();
			gravarArq.write(valor);
			gravarArq.newLine();
		} 
		gravarArq.close();
		cria.close();
	}
	
	public void salvarpvt(JTextField[] campos) throws IOException{
		String path = System.getProperty("user.dir");
		FileWriter cria = new FileWriter(path+"/src/pvt.txt");
		BufferedWriter gravarArq = new BufferedWriter(cria);
		for( int i=0; i < campos.length; i++){
			String valor = campos[i].getText();
			gravarArq.write(valor);
			gravarArq.newLine();
		} 
		gravarArq.close();
		cria.close();
	}
	
	public void salvarpt(JTextField[] campos) throws IOException{
		String path = System.getProperty("user.dir");
		FileWriter cria = new FileWriter(path+"/src/pt.txt");
		BufferedWriter gravarArq = new BufferedWriter(cria);
		for( int i=0; i < campos.length; i++){
			String valor = campos[i].getText();
			gravarArq.write(valor);
			gravarArq.newLine();
		} 
		gravarArq.close();
		cria.close();
	}
	
	public String calculaFinalIngles(JTextField x, JTextField y, JTextField prova) {
		
		String entradaX = x.getText();
		double valorX = Double.parseDouble(entradaX.replace(',', '.'));
		String entradaY = y.getText();
		double valorY = Double.parseDouble(entradaY.replace(',', '.'));
		String entradaProva = prova.getText();
		double valorProva = Double.parseDouble(entradaProva.replace(',', '.'));
		
		double result = (valorX + valorY+(2*valorProva))/4;
		String resultadoEmTexto = String.format("%.1f", result);
		return resultadoEmTexto;
	}
	
	public String notaFinaldoModulo(JTextField ingles, JTextField estru, JTextField orient,JTextField desktop, JTextField web) {
		String entradaEstrutu = estru.getText();
		double valorEstru = Double.parseDouble(entradaEstrutu.replace(',', '.'));
		String entradaINGLES = ingles.getText();
		double valorINGLES = Double.parseDouble(entradaINGLES.replace(',', '.'));
		String entradaARQUITETURA = orient.getText();
		double valorOrientado = Double.parseDouble(entradaARQUITETURA.replace(',', '.'));
		String entradaDesktop = desktop.getText();
		double valorDesktop = Double.parseDouble(entradaDesktop.replace(',', '.'));
		String entradaWEB = web.getText();
		double valorWEB = Double.parseDouble(entradaWEB.replace(',', '.'));

		double result = ((valorOrientado*60) +(valorINGLES*40)+(valorDesktop*60)+(valorEstru*60)+(valorWEB*40))/260;
		String resultadoEmTexto = String.format("%.1f", result);
		return resultadoEmTexto;
	}
	
	public String calculaFinalESTRUTURA(JTextField x, JTextField y, JTextField prova) {
		
		String entradaX = x.getText();
		double valorX = Double.parseDouble(entradaX.replace(',', '.'));
		String entradaY = y.getText();
		double valorY = Double.parseDouble(entradaY.replace(',', '.'));
		String entradaProva = prova.getText();
		double valorProva = Double.parseDouble(entradaProva.replace(',', '.'));
		
		double result = (valorX + valorY+(2*valorProva))/4;
		String resultadoEmTexto = String.format("%.1f", result);
		return resultadoEmTexto;
	}
	
	public String calculaFinalPOO(JTextField x, JTextField y, JTextField prova) {
		
		String entradaX = x.getText();
		double valorX = Double.parseDouble(entradaX.replace(',', '.'));
		String entradaY = y.getText();
		double valorY = Double.parseDouble(entradaY.replace(',', '.'));
		String entradaProva = prova.getText();
		double valorProva = Double.parseDouble(entradaProva.replace(',', '.'));
		
		double result = (valorX + valorY+(2*valorProva))/4;
		String resultadoEmTexto = String.format("%.1f", result);
		return resultadoEmTexto;
	}
	
	public String calculaFinalDESKTOP(JTextField x, JTextField y, JTextField prova) {
		
		String entradaX = x.getText();
		double valorX = Double.parseDouble(entradaX.replace(',', '.'));
		String entradaY = y.getText();
		double valorY = Double.parseDouble(entradaY.replace(',', '.'));
		String entradaProva = prova.getText();
		double valorProva = Double.parseDouble(entradaProva.replace(',', '.'));
				
		double result = (valorX + valorY+(2*valorProva))/4;
		String resultadoEmTexto = String.format("%.1f", result);
		return resultadoEmTexto;
	}
	public String calculaFinalWEB(JTextField x, JTextField y, JTextField prova) {
		
		String entradaX = x.getText();
		double valorX = Double.parseDouble(entradaX.replace(',', '.'));
		String entradaY = y.getText();
		double valorY = Double.parseDouble(entradaY.replace(',', '.'));
		String entradaProva = prova.getText();
		double valorProva = Double.parseDouble(entradaProva.replace(',', '.'));
		
		double result = (valorX + valorY+(2*valorProva))/4;
		String resultadoEmTexto = String.format("%.1f", result);
		return resultadoEmTexto;
	}
	
	public String calculaNotasSemanais(JTextField x, JTextField y) {	
		if (x.getText().trim().equals("")||y.getText().trim().equals("")) {
			return "404";
		}else {					
			String entradaX = x.getText();
			double valorX = Double.parseDouble(entradaX.replace(',', '.'));
			String entradaY = y.getText();
			double valorY = Double.parseDouble(entradaY.replace(',', '.'));
			resultado = (valorX + valorY)/2;
			resultado = Double.valueOf(String.format(Locale.US, "%.1f", resultado));
			String resultadoEmTexto = ""+resultado;
			return resultadoEmTexto;			
		}
	}
		
	public String calculaNotaTotalIngles(JTextField a1,JTextField a2,JTextField a3,JTextField a4,JTextField a5,
			JTextField a6,JTextField a7,JTextField a8,JTextField a9,JTextField a10) {
		double calc= Double.parseDouble(a1.getText()) + Double.parseDouble(a2.getText())+
		Double.parseDouble(a3.getText())+Double.parseDouble(a4.getText())+Double.parseDouble(a5.getText())+
		Double.parseDouble(a6.getText())+Double.parseDouble(a7.getText())+Double.parseDouble(a8.getText())+
		Double.parseDouble(a9.getText())+Double.parseDouble(a10.getText());
		calc = calc/10;
		String resultadoEmTexto = String.format("%.1f", calc);
		return resultadoEmTexto;
	}
	
	public String calculaNotaTotalProEstruturada(JTextField a1,JTextField a2,JTextField a3,JTextField a4,JTextField a5,
			JTextField a6,JTextField a7,JTextField a8,JTextField a9) {
		double calc= Double.parseDouble(a1.getText()) + Double.parseDouble(a2.getText())+
		Double.parseDouble(a3.getText())+Double.parseDouble(a4.getText())+Double.parseDouble(a5.getText())+
		Double.parseDouble(a6.getText())+Double.parseDouble(a7.getText())+Double.parseDouble(a8.getText())+
		Double.parseDouble(a9.getText());
		calc = calc/9;
		String resultadoEmTexto = String.format("%.1f", calc);
		return resultadoEmTexto;
	}
	
	public String calculaNotaTotalProgOrientado(JTextField a1,JTextField a2,JTextField a3,JTextField a4,JTextField a5,
			JTextField a6,JTextField a7,JTextField a8,JTextField a9, JTextField a10) {
		double calc= Double.parseDouble(a1.getText())+Double.parseDouble(a2.getText())+
		Double.parseDouble(a3.getText())+Double.parseDouble(a4.getText())+Double.parseDouble(a5.getText())+
		Double.parseDouble(a6.getText())+Double.parseDouble(a7.getText())+Double.parseDouble(a8.getText())+
		Double.parseDouble(a9.getText()+Double.parseDouble(a10.getText()));
		calc = calc/10;
		String resultadoEmTexto = String.format("%.1f", calc);
		return resultadoEmTexto;
	}
	
	public String calculaNotaTotalDesktop(JTextField a1,JTextField a2,JTextField a3,JTextField a4,JTextField a5,
			JTextField a6,JTextField a7) {
		double calc= Double.parseDouble(a1.getText()) + Double.parseDouble(a2.getText())+
		Double.parseDouble(a3.getText())+Double.parseDouble(a4.getText())+Double.parseDouble(a5.getText())+
		Double.parseDouble(a6.getText())+Double.parseDouble(a7.getText());
		calc = calc/7;
		String resultadoEmTexto = String.format("%.1f", calc);
		return resultadoEmTexto;
	}

	public String calculaNotaTotalAUTORIAWEB(JTextField a1,JTextField a2,JTextField a3,JTextField a4,JTextField a5,
			JTextField a6,JTextField a7,JTextField a8,JTextField a9, JTextField a10) {
		double calc= Double.parseDouble(a1.getText()) + Double.parseDouble(a2.getText())+
		Double.parseDouble(a3.getText())+Double.parseDouble(a4.getText())+Double.parseDouble(a5.getText())
		+Double.parseDouble(a6.getText())+Double.parseDouble(a7.getText())+Double.parseDouble(a8.getText())+
		Double.parseDouble(a9.getText())+Double.parseDouble(a10.getText());
		calc = calc/10;
		String resultadoEmTexto = String.format("%.1f", calc);
		return resultadoEmTexto;
	}
	
	public void selecionaTodoConteudo(JTextField x , JTextField y) {
		y.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent e) {				
				// coloca o foco no componente
		        y.requestFocus();
		        // seleciona todo o conteúdo
		        y.selectAll();
			}
		});
		x.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent e) {					
				// coloca o foco no componente
		        x.requestFocus();
		        // seleciona todo o conteúdo
		        x.selectAll();
			}
		}); 
	}

	public void limparCampos(JPanel container)	{
	    Component components[] = container.getComponents();
	    for (Component component : components){
	        if (component instanceof JTextField){
	            ((JTextField)component).setText("0");
	            ((JTextField)component).setBackground(new Color(255, 255, 255));
	        }
	    }
	}
}
