
delete from endereco;
delete from escola;
delete from iptu;

insert into endereco (logradouro, numero, bairro) values ('Rua da esperança', 1, 'Água Verde');
insert into endereco (logradouro, numero, bairro) values ('Rua da paz', 256, 'Novo Mundo');

insert into escola (nome, tipo, endereco_id) values ('Escola Municipal Bom Destino', 'MUNICIPAL', 1);
insert into escola (nome, tipo, endereco_id) values ('Escola Estadual Bom Destino', 'ESTADUAL', 2);

insert into iptu (inscricao_imobiliaria, inscricao_fiscal, sub_lote,total_exercio , exercicio, valor_venal, valor_imposto, taxa_coleta_lixo, logradouro, prorietario, cpf_cnpj_proprietario)
			values ('123456', '4108375547', '057', 722.79, 2021, 234800, 487.51, 275.40, 'Rua Santa Catarina, 695', 'Rodrigo de Araujo', '04197328613');
		
insert into iptu (inscricao_imobiliaria, inscricao_fiscal, sub_lote,total_exercio , exercicio, valor_venal, valor_imposto, taxa_coleta_lixo, logradouro, prorietario, cpf_cnpj_proprietario)
			values ('789654', '45548955', '075', 55.10, 2021, 16400, 57.40, 0, 'Rua Santa Catarina, 695', 'Rodrigo de Araujo', '04197328613');