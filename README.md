wrk -t12 -c400 -d30s http://localhost:8080/hellox
11929	11902	12001	12088	11836 (request/s)
20.00	20.02	19.89	19.70	20.26 (avg response time ms)

wrk -t12 -c400 -d30s http://localhost:8080/helloy
11826	11636 	11833	11745	11815	
20.17	20.47	20.13	20.33	20.19

wrk -t12 -c400 -d30s http://localhost:8080/hellox-new
11956	11881	11911	11945	11937
19.90	20.15	20.03	19.94	19.97

wrk -t12 -c400 -d30s http://localhost:8080/helloy-new
11793	11831	11850	11792	11671
20.23	20.13	20.13	20.24	20.42